
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * tao socket, tao client connection cho tung client
 *  tao BroadcastThread gui mess cho cac client 
 * gui mess cho cac client
 */

public class Server implements Runnable{
    private int sessionNo = 0;
    private ArrayList<Message> broadCastQueue = new ArrayList<Message>();    
    private ArrayList<ClientConnection> clients = new ArrayList<ClientConnection>();
    private ArrayList clientOut;
    
    
    private ServerSocket s;
    /*
    public Server(int port) throws Exception{
          
        try {
            s = new ServerSocket(2222);         //init socket
            sessionNo++;
            Log.add("server started ...");
        } catch (IOException ex) {
            Log.add("Server error ");
        }
        new BroadcastThread().start();           //start Broadcast thread 
        while(true) {                            //accept incoming connect
            try {
                Socket c = s.accept();
                
                ClientConnection cc = new ClientConnection(this, c); //create a ClientConnection thread
                cc.start();
                clients.add(cc);
                Log.add("Got connection fr " + c.getInetAddress() + ":" 
                        + c.getPort() );
            } catch (IOException ex) {
            }
        }
       
    }
   */
    public void addToBroadcastQueue(Message m) { //them cac mess vao hang doi de gui den cac client
        try {
            broadCastQueue.add(m);
        } catch (Throwable t) {}
    }

    @Override
    public void run() {
        try {
            s = new ServerSocket(GUI.port);         //init socket         
           
            Log.add("Khởi động server ở port: " +GUI.port + "\n");
        } catch (IOException ex) {
            //Log.add("Server error ");
        }
        new BroadcastThread().start();           // Broadcast thread 
        while(true) {                            //accept incoming connect
            try {
                Socket c = s.accept();
                
                ClientConnection cc = new ClientConnection(this, c); //tao ClientConnection thread
                cc.start();
                clients.add(cc);
                Log.add("Connect từ " + c.getInetAddress() + ":" 
                        + c.getPort() );
            } catch (IOException ex) {
            }
        }
    }

    /**
     * gui cac mess toi cac client, xoa cac mess cu trong queue
     */
    private class BroadcastThread extends Thread {
        
        public BroadcastThread() {
        }
        
        @Override
        public void run() {
            while(true) {
                try {
                    //xoa cac client ko hoat dong
                    ArrayList<ClientConnection> toRemove = new ArrayList<ClientConnection>(); //create a list of dead connections
                    for (ClientConnection cc : clients) {
                        if (!cc.isAlive()) {            //remove
                            toRemove.add(cc);
                        }
                    }
                    clients.removeAll(toRemove);                 //kill all 
                    //gui cac mess vao toSend queue
                    Message m = broadCastQueue.get(0);
                    for (ClientConnection cc : clients) { //gui mess dem tat ca cac client connect cung port
                        if (cc.getChId() != m.getChId()) {
                            cc.addToQueue(m);
                        }
                    }
                        broadCastQueue.remove(m); //xoa khoi queue
                    
                } catch (Throwable t) {}
            }
        }
    }
}

