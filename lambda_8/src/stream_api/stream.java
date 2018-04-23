/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author HP
 */
public class stream {
    public static void main(String[] args) {

         List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        //stream
        list.stream().filter(s->s%2==0).forEach(System.out::println);
        System.out.println("");
        list.parallelStream().unordered().filter(s->s%2==0).forEachOrdered(System.out::println);
        
        
        //returns stream
        System.out.println(" return stream");
   Stream<Integer> mystream=list.stream().map(s->s*2);
  // mystream.forEach(System.out::println);
     mystream.filter(s->s%2==0).forEach(System.out::println);
  // list.stream().map(s->s*2).filter(s->s%2==0).forEach(System.out::println);
    }
}
