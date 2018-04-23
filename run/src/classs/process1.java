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
public class process1 {
    public static void main(String args[]) throws Exception{
        Runtime r=Runtime.getRuntime();
        Process p=null;
        r.gc();
       p=r.exec("notepad");
       System.out.println(r.getClass());
      
       System.out.println(r.totalMemory());
       System.out.println(r.freeMemory());
 
    }
    
}
