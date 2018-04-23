/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.util.Collection;
import java.util.*;

/**
 *
 * @author HP
 */
public class hashmap {
    public static void main(String args[]){
        HashMap<String,Integer> h=new HashMap<>();
        h.put("gaurav",6485);
        System.out.println(h);
        h.put("saurav",2874);
        System.out.println(h);
        Collection<Integer> r=h.values();
        System.out.println(r);
       for(int e:r){
           System.out.println(e);
       }
        

    }

   
}
