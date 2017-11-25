/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexample;

/**
 *
 * @author up839743
 */
import java.rmi.registry.*;
import java.io.*;

public class MyClient {

    public static void main(String [] args) throws Exception {

        //Change this to the servers IP and match port number
        Registry reg = LocateRegistry.getRegistry("10.120.5.172", 1996) ;
        MyRemoteInterface handle = (MyRemoteInterface) reg.lookup("myrmiserver");
        
        boolean chat = true;
        handle.printMessage("Computer 1 Has joined chat");
        
        while(chat){
            System.out.println("Enter a message: ");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String message = in.readLine() ;

            handle.printMessage("Com1: " + message);
        }
    }
    
}
