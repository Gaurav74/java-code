/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list=new LinkedList<>();
        list.add(14);
        list.add(6);
        list.add(8);
        System.out.println("this is before sorting");
        System.out.println(list);
        list.add(87);
        LinkedList<Integer> l=new LinkedList<>();
         l.addAll(list);
         l.addLast(5);
         l.addFirst(3);
         l.removeFirstOccurrence((Integer)1);
         int first=l.getFirst();
  int last=l.getLast();

        //UnaryOperator<Integer> operator = null;
        //list.replaceAll(operator);
        list.remove((Object)87);
        List list2=list.subList(0,2);
        System.out.println("this is sublist "+list2);
    list.set(0,140);
    list.sort(null);
    System.out.println(list);
    List<String> ll=new ArrayList<>();
 int y=  (int) "sddsd".chars().distinct().count();
 ll.add("zello");
 ll.add("jikk");
   ll.sort(null);
    System.out.print(ll);
    }
    
}
