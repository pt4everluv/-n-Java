/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;


public class client {
    //call's status
    public static boolean calling = false;
    public static boolean invite = false;
    public static boolean acceptToCall = false;
    public static Socket sock;
    //another user's info
    public static InetAddress callTo;
    
    public static InetAddress myID;
    public static void main(String[] args) throws UnknownHostException {
        call callFr = new call();       
        
        callFr.setVisible(true);
        while(true){
            if (invite){
                incoming comingFr = new incoming();                
                comingFr.setVisible(true);
            }
        }
    }
    
}
