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
public class two implements Intrfc{
    public void display(){
         System.out.println("two");
        
     }
      public void sum(){
          System.out.println("sum is=2");
     }
       public static void main(String args[]){
        two th=new two();
        th.display();
        th.sum();
       }
}
    

