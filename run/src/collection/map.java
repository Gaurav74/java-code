/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author GAURAV
 */
public class map {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(1, 1);
        hash.put(4,5);
    int a=    hash.putIfAbsent(1,1);
        int b=hash.putIfAbsent(2,4);
        System.out.print(hash+" "+a+" "+b);
    Set<Integer> set=hash.keySet();
        Object[] array=set.toArray();
        
    }
    
}
