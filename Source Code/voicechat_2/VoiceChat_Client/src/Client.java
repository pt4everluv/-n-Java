
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */

public class Client extends Thread {

    private Socket s;
    private ArrayList<PlayThread> chs = new ArrayList<PlayThread>();
    private MicThread st;

    public Client(String serverIp, int serverPort) throws UnknownHostException, IOException {
        s = new Socket(serverIp, serverPort);
    }

    @Override
    public void run() {
        try {
            ObjectInputStream fromServer = new ObjectInputStream(s.getInputStream());  //create object streams with the server
            ObjectOutputStream toServer = new ObjectOutputStream(s.getOutputStream());
            try {
               
                st = new MicThread(toServer);  
                st.start();                     //tao thread  MicThread
            } catch (Exception e) { 
                System.out.println("mic unavailable " + e);
            }
            while(true) {           //cho data tu server
                
                if (s.getInputStream().available() > 0) { //co du lieu tu server
                    Message in = (Message) (fromServer.readObject()); //read message
                    
                    PlayThread sendTo = null; 
                    for (PlayThread ch : chs) {
                        if (ch.getChId() == in.getChId()) {
                            sendTo = ch;
                        }
                    }
                    if (sendTo != null) {
                        sendTo.addQueue(in);
                    } else { //mo PlayThread thread
                        PlayThread ch = new PlayThread(in.getChId());
                        ch.addQueue(in);
                        ch.start();
                        chs.add(ch);
                    }
                }else{ //delete thread
                    ArrayList<PlayThread> kill=new ArrayList<PlayThread>(); //kill các thread 
                    for(PlayThread c:chs) 
                        if(c.canKill()) kill.add(c);
                    for(PlayThread c:kill)
                    {
                        c.closeAndKill(); chs.remove(c);
                    }
                    Utils.sleep(1); 
                }
            }
        } catch (Exception e) { //connection error
            System.out.println("client err " + e.toString());
        }
    }
   
}
 