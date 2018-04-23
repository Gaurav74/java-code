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
public class three implements Intrfc{
  public void display(){
         System.out.println("thre");
     }
    public void sum(){
          System.out.println("sum is=3");
     }
    public static void main(String args[]){
        three th=new three();
        th.display();
        th.sum();
    }
}
