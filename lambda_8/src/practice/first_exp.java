/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import  static java.lang.System.out;

/**
 *
 * @author HP
 */
public class first_exp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        In functional programming in java there must be a interface defining the function and 
        it must be a functional interface mean it must have only one method de3claration.
        return type should be of that interface
        */
         //gaurav name=()-> out.println("Gaurav");
       //  gaurav lastName=()->out.println("Kumar");
         
       // name.name();
       // lastName.name();
     
       gaurav add=(a,b)->{
           
           return a+b;
       };
        System.out.println(add.name(5, 4));
               
       
        System.out.println(); 
       
       
       length _length =(s)-> s.length();
        System.out.println(_length.stringLength("Gaurav Kumar"));
    }

}
@FunctionalInterface
interface gaurav{
 
    int name(int a,int d);
}
@FunctionalInterface
interface length{
    int stringLength(String s);
}
