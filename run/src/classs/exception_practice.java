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
public class exception_practice extends Thread implements Runnable {
    Thread t;
    exception_practice(){
        t=new Thread(this);
   System.out.println("name of thread:"+this.t);
   t.setName("gaurav thread");
   t.setPriority(4);
    System.out.println("name of thread:"+this.t);
    
    t.start();
}
    
    
    public synchronized void run(){
    try{
            for(int e=0;e<5;e++){
                System.out.println("sleeping thread:"+(e+1));
                t.sleep(500); 
            }
        }
        catch(Exception e){
            System.out.println("run error"+e);
        }
    }
    void ex(){
        //throw new NullPointerException("Error is here") ;
        NullPointerException e=new NullPointerException("pehla");
        e.initCause(new ArithmeticException("new error"));
        throw e;
    }
    public static void main(String args[]){
        exception_practice eo=new exception_practice();
        System.out.println("check of alive:"+eo.t.isAlive());
        try{
            eo.t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        try{
            
            try{
            int ar[]=new int[4];
            ar[45]=32;}
            catch(Exception e){
                System.out.println(e);
            }
            int a=0,b=4;
            int c=b/a;
        }
        catch(Exception e){
            System.out.println(e);
        }
       try{
           eo.ex();
       }
       catch(Exception e){
           System.out.println(e);
       System.out.println(e.getCause());
       }
       try{
           throw new err(78);
       }
       catch(Exception e){
           System.out.println(e);
       }
       try{
            eo.t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
}
class err extends Exception{
    int value;
    err(int s){
         value=s;
}
    public String toString(){
   return "your error num is="+value;
}
}







