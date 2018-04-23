/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;



/**
 *
 * @author HP
 */
public class thread4 implements Runnable{
    Thread t; 
    URL url=null;
    static int i=1,y;
      Scanner s=new Scanner(System.in); 
    Runtime r=Runtime.getRuntime();
        Process p=null;
        volatile int runint;
    thread4(String name){
       t=new Thread(name);
        System.out.println(t);
        System.out.println((i++) +"is working thread");
         System.out.println("Enter any number to choose work....\n 1..start notepad\n...2...video\n"
       +"3...jdbc\n4...teacher project");
         runint=s.nextInt();
         t.start();
    }
   public synchronized void run(){
       try{  
            System.out.println(r.totalMemory());
           System.out.println(r.freeMemory());
           r.gc();
        switch(runint){
            case 1:               
                p=r.exec("notepad");
                r.wait();
                break;
            case 2:
                p=r.exec("C:\\Users\\HP\\Videos\\TV\\The 100\\Season 01\\00 Sneak Peek_SMID9A7DA8DC-E846-4EC7-A750-2E64DE4D62DD.MP4\"");
                r.wait();
                break;
            case 3:
                thread4help th4=new thread4help();
                Thread hp=new Thread(th4);
                hp.start();
              
              break;
            case 4:
               // app1 ap=new app1();
               // Thread t2=new Thread(ap);
               // t2.start();
                               
                break;
            default:
                System.out.println("wrong ...terminating");
                break;                
        }
        System.out.println("total used:"+(r.totalMemory()-r.freeMemory()));
    }
    catch(IOException | InterruptedException e){  
    System.out.println(e);
    }
}
public static void main(String args[]){   
    try{
      long tm1=System.currentTimeMillis();
        thread4 first=new thread4("1 thread");
     Thread t=new Thread( first);
      t.start();
      t.join();
      long tm2=System.currentTimeMillis();
      System.err.println(tm2-tm1);
     //first.t.join();
      System.out.println("first thread terminated");
     System.err.println("err");
        thread4 second=new thread4("2 thread"); 
      Thread t2=new Thread(second);
      long tm3=System.currentTimeMillis();
      t2.start();
    t2.join();
    long tm4=System.currentTimeMillis();
    System.err.println(tm4-tm3);
      System.out.println("second thread terminated"); 
      //System.out.println("first is alive:"+first.t.isAlive()+t.isAlive());
      System.out.println("first and second is alive "+t.isAlive()+"   "+t2.isAlive());
      System.out.printf("%d\n",4);      
    }
catch(InterruptedException e){
    System.out.println(e);
}
finally {
        System.out.println("happy theading");
    }    
} 

}

