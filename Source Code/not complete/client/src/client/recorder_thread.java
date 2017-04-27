/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.sound.sampled.TargetDataLine;

public class recorder_thread extends Thread{
    public TargetDataLine audio_in = null;
    public DatagramSocket dout;
    byte byte_buff[] = new byte[512];
    public InetAddress toIP;
    public int toPort;
    @Override
    public void run(){
        while(client.calling){
            try {
                audio_in.read(byte_buff, 0, byte_buff.length);
                DatagramPacket data = new DatagramPacket(byte_buff, byte_buff.length, server_ip, server_port);
                dout.send(data);
                
            } catch (IOException ex) {       
            }
        }
        audio_in.close();
    }
}
