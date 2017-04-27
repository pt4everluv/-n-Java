/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.io.*;
import java.net.*;

/**
 *
 * @author Vinh
 */
public class handle extends Thread{
    private Socket sock;
    private InputStream in;
    private OutputStream out;
    
    String nick="";
    boolean talking = false;    //call's status
    boolean mute = false;
    boolean admin = false;
    int talkingNo = 0;          //talking users number
    sound audio = new sound();  
    boolean lastPacket = true;
    boolean keepgoing =false;
    
    public handle(Socket sock){
        this.sock=sock;        
    }
    
    public class sendout extends Thread{
        
        @Override
        public void run(){
            try{
                while(keepgoing){
                    
                }
            }catch(Exception e){}
        }
    }
    
    public class terminate extends Thread{
        handle fr;
        public boolean shClose;
        public boolean closed;
        public terminate(handle fr){
            this.fr = fr;
        }
        @Override
        public void run(){
            try{
            if( shClose && !closed ){
                closed = true;
                if( fr.in != null ){
                    fr.in.close();
                }
                if( fr.out != null){
                     fr.out.close();
                }
                if( fr.sock != null ){
                    fr.sock.close();
                }
            }
            }catch (Exception ex){}              
        }
    }
}
