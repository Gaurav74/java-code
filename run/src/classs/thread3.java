/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

/**
 *
 * @author HP
 */
public class thread3 implements Runnable{
    Thread t;
    thread3(String s){
        
        t=new Thread(this,s);
        System.out.println(this.t.getId());
        t.setName("new one");
        System.out.println(this.t.getId());
        System.out.println(t.getId());
        System.out.println(t);
        
    }
    public synchronized void run(){
        for(int r=0;r<5;r++){
            System.out.println("Time is:"+r);
        }
    }
    public static void main(String args[]){
        thread3 t3 = new thread3("hi id");
        t3.t.run();
         t3.t.run();
      
        
    }
}
