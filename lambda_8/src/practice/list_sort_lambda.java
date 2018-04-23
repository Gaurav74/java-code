/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HP
 */
public class list_sort_lambda {

    /**
     * @param s
     * @return 
     */
    public static String name(String s){
        return s;
    }
    
    
    public static void main(String[] args) {
            List<String> list=Arrays.asList(
            "Gaurav","kumar","hello","Good","koor"
            );
  
           Collections.sort(list);
            list.parallelStream().forEachOrdered(System.out::println);
            System.out.println();
            list.stream().filter((s)->s.startsWith("G")).forEach(System.out::println);
            System.out.println("  ");
        list.parallelStream().forEachOrdered(System.out::println);
         System.out.println(list.stream().count());
        
    }
    
}
