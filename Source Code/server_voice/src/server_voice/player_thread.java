/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_voice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import javax.sound.sampled.SourceDataLine;

public class player_thread extends Thread{
    public DatagramSocket din;
    public SourceDataLine audio_out;
    byte[] buffer = new byte[512];
    @Override
    public void run(){
        DatagramPacket in  = new DatagramPacket(buffer, buffer.length);
        while (Server_voice.calling) {            
            try {
                din.receive(in);
                buffer = in.getData();
                audio_out.write(buffer, 0, buffer.length);
            } catch (IOException ex) {}
        }
        audio_out.close();
    }
}
