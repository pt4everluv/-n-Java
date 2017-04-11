

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package server_voice;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

/**
 * this thread manages a connection with a client.: -read
 * messages from client -add said messages to the server's broadcast queue
 * -receive messages from the server thread -add said messages to a send queue
 * -send messages from said queue to the client (or throw them away if too old)
 *
 */
public class client_connect extends Thread {

    private Server_voice serv; //instance of server, needed to put messages in the server's broadcast queue
    private Socket s; //connection to client 
    private ObjectInputStream in; //object streams to/from client
    private ObjectOutputStream out;
    private long chId; //unique id of this client, generated in the costructor
    private ArrayList<Message> toSend = new ArrayList<Message>(); //queue of messages to be sent to the client

    public InetAddress getInetAddress() { //returns this client's ip address
        return s.getInetAddress();
    }

    public int getPort() { //returns this client's tcp port
        return s.getPort();
    }

    public long getChId() { //return this client's unique id
        return chId;
    }

    public client_connect(Server_voice serv, Socket s) {
        this.serv = serv;
        this.s = s;
        byte[] addr = s.getInetAddress().getAddress();

    }

    public void addToQueue(Message m) { //add a message to send to the client
        try {
            toSend.add(m);
        } catch (Throwable t) {}
    }

    @Override
    public void run() {
        try {
            out = new ObjectOutputStream(s.getOutputStream()); //create object streams to/from client
            in = new ObjectInputStream(s.getInputStream());
        } catch (IOException ex) { //connection error, close connection
            try {
                s.close();
            } catch (IOException ex1) {
            }
            //stop();
        }
        for (;;) {
            try {
                if (s.getInputStream().available() > 0) { //client send data
                    Message toBroadcast = (Message) in.readObject(); //read data from client
                    //add data from client to broadcast queue
                    if (toBroadcast.getChId() == -1) { //from client to server
                        toBroadcast.setChId(chId);
                        
                        serv.addToBroadcastQueue(toBroadcast);
                    } else {
                        continue; // message not exist, pass
                    }
                }
                try {
                    if (!toSend.isEmpty()) {                //have something
                        Message toClient = toSend.get(0);   //have comming data from client
                        if (!(toClient.getData() instanceof SoundPacket) || toClient.getTimestamp() + toClient.getTtl() < System.nanoTime() / 1000000L) { //is the message too old or of an unknown type?
                            continue;
                        }
                        out.writeObject(toClient); //send the message
                        toSend.remove(toClient); //remove it from the queue
                    } else {
                        Thread.sleep(10); 
                    }
                } catch (Throwable t) {
                    if (t instanceof IOException) { //connect error
                        throw (Exception) t;
                    } else {//multithread error
                        continue;
                    }
                }
            } catch (Exception ex) { //connection closed, close thread
                try {
                    s.close();
                } catch (IOException ex1) {
                }
                //stop();
            }
        }

    }
}
