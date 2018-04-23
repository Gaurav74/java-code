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
public class exception4 extends Exception {
   private int detail;
  exception4(int a){
       detail=a;
        }
  public String tostring(){
      return "value is["+detail+"]";
  }
}
class shows{
   static void exp(int a) throws exception4{
        if(a>6)
            throw new exception4(a);
    System.out.println("no error in:"+a);}
        public static void main(String args[]){
           try{
            exp(3);
            exp(65);
            }
           catch(exception4 e){
               System.out.println("caught:"+e);
           }
        }
        
    }

