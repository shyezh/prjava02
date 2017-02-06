/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 *@author ­­> shyezh1617daw2@gmail.com
 */
public class Prjava02 {

    /**
     *    @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Versió 0.1 del projecte prjava02");
        try {
            InetAddress adreça = InetAddress.getLocalHost();
            String hostname = adreça.getHostName();
            System.out.println("hostname=" + hostname);
            System.out.println("Carpeta Personal " + System.getProperty("user.home"));
            System.out.println("Sustema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
        } catch (IOException e) {
        }
    }
}
