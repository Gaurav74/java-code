
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class find_repeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
       HashMap<Integer,Integer> list=new HashMap<>();
       int temp,count=1;
       int size=s.nextInt();
       for(int i=0;i<size;i++){
          temp=s.nextInt();
          if(list.get(temp)==null){
          list.put(temp,count);}
          else{
              int value=list.get(temp);
              list.put(temp,++value);
          }
       }
       Set<Integer> set=new LinkedHashSet<>();
       //set=(Set<Integer>) list.values();
       System.out.println(list.values());
       System.out.println(Collections.max(list.values()));
    }
    
}
