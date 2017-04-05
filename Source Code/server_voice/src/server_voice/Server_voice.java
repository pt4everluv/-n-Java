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
    ArrayList clientOuputStream;
    public class severStart implements Runnable  {
        
       
        @Override
        public void run() {
            users = new ArrayList();  
            clientOuputStream = new ArrayList();

            try {
                ServerSocket serverSock = new ServerSocket(2222);
                while(true){
                    Socket clientSock = serverSock.accept();
                    
                }
            } catch (IOException ex) {}
                

        }
        
    }   
    
}
