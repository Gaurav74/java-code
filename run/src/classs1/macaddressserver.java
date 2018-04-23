/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class macaddressserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
         ServerSocket server=new ServerSocket(1234);
         Socket s=server.accept();
         ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in=new ObjectInputStream(s.getInputStream());
            String mac=(String)in.readObject();
        System.out.println(mac);
        InetAddress inet=s.getInetAddress();
        String ip=inet.getHostAddress();
        if(mac.equals("70-77-81-A6-5C-75")){
        out.writeObject(Boolean.TRUE);
        out.writeObject(ip);
        }
        else{
            out.writeObject(Boolean.FALSE);
        }
        }
        catch(Exception e){
            
        }
    }
    
}
