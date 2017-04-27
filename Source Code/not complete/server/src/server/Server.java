/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinh
 */
public class Server {
    private static ServerSocket svSoc;
    Socket soc;
    public static void main(String[] args) {
        try {
            svSoc = new ServerSocket(8000);
        } catch (IOException ex) { Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);}
       
    }
    
}
