/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.util.*;

/**
 *
 * @author HP
 */
public class exception {
   static int a=0,b;
    public static void main(String args[]){
        try{
            Random r=new Random();
            b=(r.nextInt())*10;
           int num=b/a;
        }
    catch(Exception e){
    System.out.println("error:"+e);
}
    
}}
