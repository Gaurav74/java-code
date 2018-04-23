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
public class thead1 {
    public static void main(String args[]){
        Thread t = new Thread();
        t.getName();
        System.out.println("thread:"+t);
        t.setName("GAURAV");
        System.out.println("thread:"+t);
        try {
            for(int r=4;r>0;r--){
                System.out.println("start: "+r);
              t.sleep(1000);   
            }
           
        } catch (InterruptedException e) {
          System.out.println(e);
        }
        finally{
            System.out.println("out of thread");
        }
    }
    
}
