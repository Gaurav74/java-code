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
public class instance_inference {
    
    
    public  void namePrint(String s,Name n){
     n.name(s);
    }
    
    public static void main(String[] args) {
        instance_inference var= new instance_inference();
        Name myname=(s)->System.out.println("Gaurav");
 var.namePrint("Gaurav",myname);   
// var.namePrint("Gaurav",(s)->System.out.println(s));
       // var.namePrint(myname);
       
       
        
    }
}
 @FunctionalInterface
 interface Name{
     public void name(String s);
 }