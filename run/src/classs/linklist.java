/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;
import java.util.*;
import static java.util.Collections.max;
import static java.util.Collections.min;

/**
 *
 * @author HP
 */
public class linklist {
    public static void main(String args[]){
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
       int d=l.get(0);
       System.out.println(d);
    l.add(2);
    l.add(3);
    l.add(5);
    l.add(4);
    System.out.println(l);
    sort(l);
    System.out.println(l);
    reverse(l);
    System.out.println(l);
    System.out.println(max(l));
    System.out.println(min(l));
    }
}
