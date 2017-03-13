/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.sound.sampled.AudioFormat;

/**
 *
 * @author Vinh
 */
public class packet implements java.io.Serializable {
        public static AudioFormat defaultFormat=new AudioFormat(11025f, 8, 1, true, true); //11.025khz, 8bit, mono, signed, big endian (changes nothing in 8 bit) ~8kb/s
    public static int defaultDataLenght=1200; //send 1200 samples/packet by default
    private byte[] data; //actual data. if null, comfort noise will be played

    public packet(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }
}
