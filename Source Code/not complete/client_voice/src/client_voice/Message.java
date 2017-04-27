
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * any type object
 */
public class Message implements Serializable{
    private long chId; //-1:  client to server, 1 creeated by server
    private long timestamp; //-1: client to server, timeStamp of the moment when the server receives the message
    private long ttl=2000; //2 seconds time to live
    private Object data; 

    
    public Message(long chId, long timestamp, Object data) {
        this.chId = chId;
        this.timestamp = timestamp;
        this.data = data;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getChId() {
        return chId;
    }

    public Object getData() {
        return data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getTtl() {
        return ttl;
    }
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }
    
    public void setChId(long chId) {
        this.chId = chId;
    }
    
}
