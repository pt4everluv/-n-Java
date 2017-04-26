
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * -nhan va doc mess tu client -them mess vao broadcast queue
 * -nhan mess tu server thread - them vao queue de gui
 * -send to client (bo neu qua cu ko su dung nua)
 */
public class ClientConnection extends Thread {

    private Server serv; 
    private Socket s;                 
    private ObjectInputStream in;                   
    private ObjectOutputStream out;
    private long chId;                                              //client's id
    private ArrayList<Message> toSend = new ArrayList<Message>();   //queue de gui mess toi client

    public InetAddress getInetAddress() {    //returns this client's ip 
        return s.getInetAddress();
    }

    public int getPort() {                  //returns this client's port
        return s.getPort();
    }

    public long getChId() {                    //return this client's unique id
        return chId;                               // -1: cl -> sv
    }

    public ClientConnection(Server serv, Socket s) {
        this.serv = serv;
        this.s = s;
        byte[] addr = s.getInetAddress().getAddress();
        chId = (addr[0] << 48 | addr[1] << 32 | addr[2] << 24 | addr[3] << 16) + s.getPort(); //generate unique chId from client's IP and port
    }

    public void addToQueue(Message m) { //them mess vao queue gui toi client
        try {
            toSend.add(m);
        } catch (Throwable t) {}
    }

    @Override
    public void run() {
        try {
            out = new ObjectOutputStream(s.getOutputStream());
            in = new ObjectInputStream(s.getInputStream());
        } catch (IOException ex) { // error
            try {
                s.close();
                Log.add("ERROR " + getInetAddress() + ":" + getPort() + " " + ex);
            } catch (IOException ex1) {}         
        }
        for (;;) {
            try {
                //nhan data tu client (id = -1 va dua vao broadcast queue
                if (s.getInputStream().available() > 0) {                  // data fr client
                    Message toBroadcast = (Message) in.readObject();     //read data from client
                    if (toBroadcast.getChId() == -1) {                   //set its chId and timestamp va gui toi the server
                        toBroadcast.setChId(chId);
                        toBroadcast.setTimestamp(System.nanoTime() / 1000000L);     //moc time
                        serv.addToBroadcastQueue(toBroadcast);
                    } else {
                        continue;                                               //ko co mess
                    }
                }
                //send to client
                try {             
                        Message toClient = toSend.get(0);       //data gui toi the client
                        if (!(toClient.getData() instanceof SoundPacket) || toClient.getTimestamp() + toClient.getTtl() < System.nanoTime() / 1000000L) { //ko phai sound hoac qua cu
                            continue;
                        }
                        out.writeObject(toClient);          //gui mess
                        toSend.remove(toClient);             //loai khoi queue                                
                } catch (Throwable t) {
                    
                }
            } catch (Exception ex) { // kill thread
                try {
                    s.close();
                } catch (IOException ex1) {
                }
            }
        }
    }
}
