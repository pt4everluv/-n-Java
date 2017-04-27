/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_voice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server_voice {

    public static boolean calling = false;
    private int sensionNo;
    ArrayList<String> users;
    ArrayList<Message> broadCastQueue; 
    ArrayList<client_connect> client;
    ArrayList clientOuputStream;
    
   
    public class server implements Runnable  {
        Socket csock;
         
        public server(Socket csock){
            this.csock = csock;
        }
        public void main(String args[]) throws Exception {
            ServerSocket svSock = new ServerSocket(2222);
            while(true){
                Socket sock = svSock.accept();             
                new Thread(new server(sock)).start();
            }         
        }            
        @Override
        public void run() {
            users = new ArrayList();  
            
            
            
        } 
    }   
    
    /*
    add message to broadcast queue of all connection
    */
    private void addToBroadcastQueue(Message m) throws InterruptedException {
       try{
            broadCastQueue.add(m);
        }catch(Throwable e){                //Throwable: superclass of all exception
            Thread.sleep(1);
            addToBroadcastQueue(m);
        }       
    }
       
    /*
    ad new connection to the list
    */
    private void addToClient(client_connect cl) throws InterruptedException{
        try{
            client.add(cl);
        }catch(Throwable e){
            Thread.sleep(1);
            addToClient(cl);
        } 
    }
    public void removeOldClient(){
        ArrayList<client_connect> toRemove = new ArrayList<client_connect>(); //create a list of dead connections
                    for (client_connect cc : client) {
                        if (!cc.isAlive()) {                //dead connection                     
                            toRemove.add(cc);
                        }
                    }
                    client.removeAll(toRemove);     //remove all dead connection
    }
    private class broadcastThread extends Thread{
        public broadcastThread() {      
    }
        @Override
        public void run(){
            while(true){
                removeOldClient();          
                if(!broadCastQueue.isEmpty()){
                    try {                       
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {}
                    continue;
               } else {                              //broadcast mess
                    Message m = broadCastQueue.get(0);
                    for (client_connect cc : client) { 
                       if (cc.getChId() != m.getChId()) {
                             cc.addToQueue(m);
                        }
                    }
                    broadCastQueue.remove(m); //remove it from the broadcast queue
                    }

            }
        }
    }
}
