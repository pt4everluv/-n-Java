package client_voice;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*This thread use device's micro to record audio */
public class MicThread extends Thread {

    public static double amplification = 1.0;
    private ObjectOutputStream toServer;
    private TargetDataLine mic;

    public MicThread(ObjectOutputStream toServer) throws LineUnavailableException {
        this.toServer = toServer;
        AudioFormat af = SoundPacket.defaultFormat;
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, null);
        
        mic = (TargetDataLine) (AudioSystem.getLine(info));
        mic.open(af);
        mic.start();
    }

    @Override
    public void run() {
        for (;;) {
            if (mic.available() >= SoundPacket.defaultDataLenght) { //enough data to send
                byte[] buff = new byte[SoundPacket.defaultDataLenght];
                while (mic.available() >= SoundPacket.defaultDataLenght) { //flush old data from mic to reduce lag, and read most recent data
                    mic.read(buff, 0, buff.length); //read from microphone
                }
                try {
                    
                    //this part is used to decide whether to send or not the packet. if volume is too low, an empty packet will be sent and the remote client will play some comfort noise
                    long tot = 0;
                    
                    for (int i = 0; i < buff.length; i++) {
                        buff[i] *= amplification;
                        tot += Math.abs(buff[i]);
                    }
                    tot *= 2.5;
                    tot /= buff.length; 
                    //create and send packet
                    Message m = null;
                    if (tot == 0) {//send empty packet
                        m = new Message(-1, -1, new SoundPacket(null));
                    } else { //send data
                        //compress by gzip to get a small size
                        ByteArrayOutputStream out = new ByteArrayOutputStream();
                        GZIPOutputStream go = new GZIPOutputStream(out);
                        go.write(buff);
                        go.flush();
                        go.close();
                        out.flush();
                        out.close();
                        m = new Message(-1, -1, new SoundPacket(out.toByteArray()));  //create message for server, will generate chId and timestamp from this computer's IP and this socket's port 
                   }
                    toServer.writeObject(m); //send message
                } catch (IOException ex) {
                   // stop();
                }
            } else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    
                }
            }
        }
    }
}
