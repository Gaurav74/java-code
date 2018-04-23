/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class thread_class implements Runnable{
    static{
       System.out.println("this will start the thread");
    }
    volatile int j=0;
    public void run(){
         //Scanner s=new Scanner(System.in);
        int i=0;
        while(i<10){
            
            try {
                System.out.println(Thread.activeCount()+" "+(j++));
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }
    public static void main(String args[]) throws InterruptedException{
        thread_class t=new thread_class();
        ThreadGroup g=new ThreadGroup("parent");
        Thread t1=new Thread(g,t,"first");
        t1.start();
        
        t1.join();
        Thread t2=new Thread(g,t,"second");
        t2.start();
        System.out.println(g.activeCount());
        Thread[] list=new Thread[2];
        g.enumerate(list);
        for(Thread d:list){
            System.out.println(list.toString());
        }
        g.setDaemon(true);
        System.out.println(g.isDaemon());
   
    System.out.println(g.activeCount());
    }
    
}
