/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.LineUnavailableException;
/**
 *
 * @author Vinh
 */
public class record extends Thread{
    private ObjectOutputStream out;
    private TargetDataLine sound;
    private int defaultLenght;
    public static double amplification = 1.0;
    public record(ObjectOutputStream out) throws LineUnavailableException{
        this.out=out;
        AudioFormat format = new AudioFormat(11025f, 8, 1, true, true);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class,null);      //khoi tao data line cho sound input
       try{
        sound = (TargetDataLine) AudioSystem.getLine(info);
        sound.open(format);
        sound.start();                          //bat dau thu
       }catch (LineUnavailableException ex){}
    }
    
    @Override
    public void run(){
        while(true){
            if (sound.available()>= defaultLenght){
                byte[] buffer =  new byte[defaultLenght];
                while (sound.available()>= defaultLenght){      //xoa phan data cu cua mic
                    sound.read(buffer,0,buffer.length);         //doc du lieu tu mic
                }
                try {
                    //this part is used to decide whether to send or not the packet. if volume is too low, an empty packet will be sent and the remote client will play some comfort noise
                    long tot = 0;
                    for (int i = 0; i < buffer.length; i++) {
                        buffer[i] *= amplification;
                        tot += Math.abs(buffer[i]);
                    }
                    tot *= 2.5;
                    tot /= buffer.length;
                    //create and send packet
                    Obj m = null;
                    if (tot == 0) {//send empty packet
                        m = new Obj(-1, -1, new packet(null));
                    } else { //send data
                        //compress the sound packet with GZIP
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        GZIPOutputStream go = new GZIPOutputStream(baos);
                        go.write(buffer);
                        go.flush();
                        go.close();
                        baos.flush();
                        baos.close();
                        m = new Obj(-1, -1, new packet(baos.toByteArray()));  //create message for server, will generate chId and timestamp from this computer's IP and this socket's port 
                   }
                    out.writeObject(m); //send message
                } catch (IOException ex) { //connection error
                }
            } else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {}
            }
        }
        
    }
}
