/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Vinh
 */
public class Client extends Thread {

private Socket soc; 
private record rec;                                        
private ArrayList<play> pl = new ArrayList<play>();         

    public Client (String svIP, int svPort) throws UnknownHostException, IOException {
            soc =new Socket(svIP,svPort);
    }
    
    @Override
    public void run(){
        try{
            ObjectInputStream in = new ObjectInputStream(soc.getInputStream());
            ObjectOutputStream out =new ObjectOutputStream(soc.getOutputStream());
            try{
                rec =new record(rec);
                rec.start();
            }
                 
        }catch( ){
            
        }
        
    }
    
}
