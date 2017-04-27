/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_voice;

import java.net.*;
import java.io.*;
/**
 *
 * @author Vinh
 */
public class HandleASession implements Runnable{
private Socket client1;
private Socket client2;



public HandleASession (Socket client1, Socket client2){
    this.client1 = client1;
    this.client2 = client2;
}
    @Override
    public void run() {
       //data input and output stream
        try{
        
        
        }catch (IOException ex){}
    }   
}
