/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.util.*;
import java.awt.*;
/**
 *
 * @author Vinh
 */
public class sound {
   
    public Vector vec = new Vector();
    boolean lock = true;
    private byte b[];


     public sound(){}

      synchronized public Object readbyte(){

           try{
           while( vec.isEmpty() ){
               wait();
           }
           }
           catch( InterruptedException ie ) { 
                   System.err.println(" your out of luck my friend :) ");
           }

           if( ! vec.isEmpty() ){
                   b = (byte[]) vec.elementAt( 0 );
                   vec.removeElementAt(0);
                   return b;
           }else{
                   byte[] b = new byte[5];
                   return b;
           }

       }

       synchronized public void writebyte( Object e ){

           vec.addElement( e );

           lock = false;
           notifyAll();

       }    
}
