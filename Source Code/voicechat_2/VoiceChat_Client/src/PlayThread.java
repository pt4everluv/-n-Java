
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * play audio
 */
public class PlayThread extends Thread {

    private long chId;                        
    private ArrayList<Message> data = new ArrayList<Message>(); //data chua data dung de play
    private int lastSoundPacketLen = SoundPacket.defaultDataLenght;
    private long lastPacketTime = System.nanoTime();

    public boolean canKill() { //reutrn true neu thoi gian tu luc nhan packet cuoi qua lau (5secs)
        if (System.nanoTime() - lastPacketTime > 5000000000L) {
            return true; //5 secs ko data
        } else {
            return false;
        }
    }

    public void closeAndKill() {
        if (speaker != null) {
            speaker.close();
        }
        stop();
    }

    public PlayThread(long chId) {
        this.chId = chId;
    }

    public long getChId() {
        return chId;
    }

    public void addQueue(Message m) { //them mes vao play data
        data.add(m);
    }
    private SourceDataLine speaker = null; //speaker

    @Override
    public void run() {
        try {
            //open sound card
            AudioFormat af = SoundPacket.defaultFormat; //11.025khz, 8bit, mono, signed, big endian  ~8kb/s
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, af);
            speaker = (SourceDataLine) AudioSystem.getLine(info);
            speaker.open(af);
            speaker.start();
            //ready
            while(true) { //doi data moi tu data va phat ra loa
                if (data.isEmpty()) {          //nothing
                    Utils.sleep(10);
                    //continue;
                } else {                    //co du lieu
                    lastPacketTime = System.nanoTime();
                    Message in = data.get(0);
                    data.remove(in);
                    if (in.getData() instanceof SoundPacket) { //du lieu phu hop
                        SoundPacket m = (SoundPacket) (in.getData());
                        if (m.getData() == null) {
                            byte[] noise = new byte[lastSoundPacketLen];
                            for (int i = 0; i < noise.length; i++) {
                                noise[i] = (byte) ((Math.random() * 3) - 1);
                            }
                            speaker.write(noise, 0, noise.length);
                        } else {
                            //decompress data da compress boi server
                            GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(m.getData()));
                            ByteArrayOutputStream read = new ByteArrayOutputStream();
                            while(true) {
                                int b = gis.read();
                                if (b == -1) {
                                    break;
                                } else {
                                    read.write((byte) b);
                                }
                            }
                            //play decompressed data
                            byte[] toPlay=read.toByteArray();
                            speaker.write(toPlay, 0, toPlay.length);
                            lastSoundPacketLen = m.getData().length;
                        }
                    } else { //du lieu ko phu hop
                        continue; 
                    }
                }
            }
        } catch (Exception e) { //deviece err, cancel
            System.out.println("receiverThread " + chId + " error: " + e.toString());
            if (speaker != null) {
                speaker.close();
            }
            stop();
        }
    }
}
