/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author HP
 */
public class url_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        URL url=new URL("https://www.javatpoint.com/URL-class");
      String host=url.getHost();
      System.out.println("host : "+host);
      int port=url.getPort();
      System.out.println("port : "+port);
        String file=url.getFile();
        System.out.println("file : "+file);
        String protocol=url.getProtocol();
        System.out.println("protocol : "+protocol);
        String userinfo=url.getUserInfo();
        System.out.println("userinfo : "+userinfo);
        URLConnection con=url.openConnection();
       InputStream in=con.getInputStream();
       BufferedReader br=new BufferedReader(new InputStreamReader(in));
       String c;
       while((c=(String) br.readLine())!=null){
           System.out.println(c);
       }
        }
    catch(Exception e){
        System.err.println(e);
    }
    }
    
}
