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
public class recursion {
   
    int print(int i){
        if(i==0||i==1)
            return 1;
        else return i*print(i-1);
    }
    
    
    public static void main(String args[]){
        recursion rec=new recursion();
        System.out.println("rec="+rec.print(5));
    }

}