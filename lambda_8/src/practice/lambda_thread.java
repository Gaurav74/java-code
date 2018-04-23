/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author HP
 */
public class lambda_thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1=new Thread(new Runnable(){
                      @Override
                public void run(){
                    System.out.println("inside thread");
                } }
        );
        t1.start();
        
 Runnable t=()->System.out.println("inside lambda"); 
Thread t2=new Thread(()->System.out.println("inside lambda")); 
        t.run();t2.run();
        
        
        
    }
    
}
