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
public class exception2 {
    static int q,c;
    public static void main(String args[]){
     Random r=new Random();
     int a=r.nextInt();
     int b=r.nextInt();
     
     try{
     for(q=1;q<1234;q++){       //still no error shown
                 c=1234/(a/b);
     }
     }
     catch(Exception e){
             System.out.println("error at:"+q);
             }
     finally {
    System.out.println("complete");
    
}
    }
}
    


