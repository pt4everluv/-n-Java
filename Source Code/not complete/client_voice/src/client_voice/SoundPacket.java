
import java.io.Serializable;
import javax.sound.sampled.AudioFormat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * sound object
 */
public class SoundPacket implements Serializable{
    public static AudioFormat defaultFormat=new AudioFormat(11025f, 8, 1, true, true); //11.025khz, 8bit, mono, signed, big endian (changes nothing in 8 bit) ~8kb/s
    public static int defaultDataLenght=1200; //1200 sample/packet
    private byte[] data; 

    public SoundPacket(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }
    
}
