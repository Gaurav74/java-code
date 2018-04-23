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
public class input {
    public static void main(String args[])
       throws java.io.IOException{
        try{
        int a,q,w;
        int b,c,d;
        System.out.println("enter first number");//still some wrong in this code
        a=(int)System.in.read();
        System.out.println("");
        System.out.println("enter the second number");
        q=(int)System.in.read();
        b=a+q;
        System.out.println(b);
        System.out.println("sum is"+b+"after add");
    }
    catch(Exception e){
    System.out.print("error:"+e);
}
    }}
