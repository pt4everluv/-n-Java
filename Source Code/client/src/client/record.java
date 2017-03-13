/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
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
    
    public record(ObjectOutputStream out) throws LineUnavailableException{
        this.out=out;
        AudioFormat format = new AudioFormat(11025f, 8, 1, true, true);
        
    }
}
