import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * object chua data va giao thuc gui len server
 */
public class Message implements Serializable    //sap xep trinh tu luu tru cua mess
{
    private long chId;                  //-1:  client -> server, 1 creeated by server
    private long timestamp;             //-1: client -> server, timeStamp danh dau moc thoi gian server nhan duoc
    private long ttl=2000;              //time to live 2sec
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
