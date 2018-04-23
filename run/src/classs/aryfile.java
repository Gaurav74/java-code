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
public class aryfile {
    public static void main(String args[]){
         ArrayList<Integer>col=new ArrayList<Integer>();
        try {
        col.add(4);
        col.add(Integer.SIZE);
        System.out.println(col.get(0));
        System.out.println(col.size());
        System.out.println(Double.SIZE);
        col.remove(1);
        System.out.println(col.get(1));
 }
  catch(Exception e){
  System.out.println("caught error"+e);
    col.clear();
    System.out.println(col.size());
  
  } 
      
}
}
