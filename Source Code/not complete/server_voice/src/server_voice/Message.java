/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_voice;

/**
 *
 * @author Vinh
 */
public class Message implements java.io.Serializable{
    private long chId;                     //-1: from client to server, 1: by the server
    private long timestamp,             //-1 means from client to server, 1 timeStamp of the moment when the server receives the message
            ttl=2000;                   //2 sec
    private Object data;                    //object use as a sound packet

    
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
