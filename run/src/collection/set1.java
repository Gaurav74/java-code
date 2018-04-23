/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package collection;


import java.util.*;

/**
 *
 * @author HP
 */
public class set1 {
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Set <Integer> array=new HashSet<>(); 
    array.add(2);
    Iterator <Integer> it=array.iterator();
    int e=it.next();
    System.out.println(e);
    for(int a=1;a<11;a++){
        int in=s.nextInt();
        array.add(in);
    }
    Set<Integer> treeset=new TreeSet<>(array);
    System.out.println("here it comes"+array);
    System.out.println(treeset);
    
   
}    
}
