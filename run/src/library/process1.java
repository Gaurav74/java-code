/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import static java.lang.System.console;
import static java.lang.System.getenv;

/**
 *
 * @author HP
 */
public class process1 {
    public static void main(String args[]) throws Exception{
       
            Runtime r=Runtime.getRuntime();
            Process p = null;
            System s;
            p=r.exec("notepad");
            p.getClass();
            p.waitFor();
           // String f="G:\\pr.txt";
           // File fp=new File(f);
           // FileOutputStream re=new FileOutputStream(f);
          //  InputStream c=p.getInputStream();
            //int y=Integer.parseInt(c);
           // re.write(c);
          System.out.println( console());
          System.out.println(getenv());
           int hs=p.hashCode();
           System.out.println(hs);
           System.out.println(r.freeMemory());
           r.gc();
           int pint=p.exitValue();
           System.out.println(pint);
           //r.halt(0); //it stops below code
           System.out.println("here");
           r.runFinalization();
       
               
           
       
    }

   
}
