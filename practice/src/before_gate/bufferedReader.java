/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package before_gate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author GAURAV
 */
public class bufferedReader {
    public static boolean meet(int s1,int j1,int s2,int j2){
       if(s1==s2) return Boolean.TRUE;
        while(s1<s2){
            s1=s1+j1;
            s2=s2+j2;
        }
        if(s1==s2) return Boolean.TRUE;
        
        
        
        
        return false;
    }
    public static void main(String[] args) {
      try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int c=0;char array[]=new char[8];int i=0;
        while((c=br.read())!='\n'){
          //  for(int i=0;i<7;i++){
          System.out.println(c);
                array[i++]=(char)c;}
           // }
            int s1=Integer.parseInt(""+array[0]),j1=Integer.parseInt(""+array[2]),s2=Integer.parseInt(""+array[4]),
                    j2=Integer.parseInt(""+array[6]);
            System.out.println(s1+" "+j1+" "+s2+" "+j2);
            if(s1<s2){
                boolean b=meet(s1,j1,s2,j2);System.out.println(b);
            }else{
                boolean b=meet(s2,j2,s1,j1);System.out.println(b);
            }
      
      }
      
    catch(Exception e){
        System.out.println(e);
    } }
    }

