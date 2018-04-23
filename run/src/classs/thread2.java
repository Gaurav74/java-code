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
public class thread2 implements Runnable  {
     Thread t;
    String s;
    thread2(String s){
        t=new Thread(this,s);
        System.out.println("loop start");
        t.setName(s);
        t.start();
    }
    public synchronized void run(){
            try {
                for(int i=0;i<3;i++){
                    System.out.println("sleep point"+i);
                    t.sleep(1000); }
                    } catch (InterruptedException e) {
               System.out.print("Gaurav caught error");
            }
        }
    
    public static void main(String args[]){
        thread2 t1=new thread2("first");
        thread2 t2=new thread2("second");
        System.out.println("first is alive:"+t1.t.isAlive());
        System.out.println("second is alive:"+t2.t.isAlive());
        try{
            System.out.println("waiting for end");
            t1.t.join();
            t2.t.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("first is alive:"+t1.t.isAlive());
        System.out.println("second is alive:"+t2.t.isAlive());
    }
}