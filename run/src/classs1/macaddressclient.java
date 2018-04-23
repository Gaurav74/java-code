/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class macaddressclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Socket s=null;
            s=new Socket(InetAddress.getLocalHost(),1234);
            InetAddress ipaddress=s.getInetAddress();
            String ip=ipaddress.getHostAddress();
            NetworkInterface ni=NetworkInterface.getByInetAddress(ipaddress);
            byte[] mac=ni.getHardwareAddress();String macid="";
           // System.out.println(mac);
               if (mac != null)
                {
                   // System.out.println("in");
                    for (int i=0; i<mac.length; i++)
                    {
                  macid=macid+(String.format("%02X%s", mac[i], (i<mac.length - 1) ? "-" :""));
                    }
                }
          System.out.println("The Ip address of host System is "+ip);
            System.out.println("The Machine address is "+macid);
            //now writing the mac address to server
            ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in=new ObjectInputStream(s.getInputStream());
            out.writeObject((Object)macid);
            boolean bool=(boolean) in.readObject();
            if(bool){
                String ipclient=(String)in.readObject();
                        System.out.println("This is reverse address protocol ip address "
                        +ipclient);
            }
            else{
                System.out.println("The reverse address resolution failed");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
