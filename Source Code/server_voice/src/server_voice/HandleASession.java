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

private DataInputStream fromClient1;
private DataInputStream fromClient2;
private DataOutputStream toClient1;
private DataOutputStream toClient2;

public HandleASession (Socket client1, Socket client2){
    this.client1 = client1;
    this.client2 = client2;
}
    @Override
    public void run() {
       //data input and output stream
        try{
        DataInputStream fromClient1 = new DataInputStream(client1.getInputStream());
        DataOutputStream toClient1 = new DataOutputStream(client1.getOutputStream());
        DataInputStream fromClient2 =new DataInputStream(client2.getInputStream());
        DataOutputStream toClient2 = new DataOutputStream(client2.getOutputStream());
        
        }catch (IOException ex){}
    }   
}
