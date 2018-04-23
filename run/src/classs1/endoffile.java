/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author HP
 */
public class endoffile {
 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Reader br=new InputStreamReader(System.in);int c;
        int i=1;
        while((c=br.read())!=-1){
             if(i==1){
              System.out.print("1 "); i++;
            }
           if(c==(int)'\n'){
               System.out.println();
               System.out.print((i++)+" ");
           }
          
            if(c!=(int)'\n')
                 System.out.print((char)c);
        
            }}
        catch(Exception e){
        }    
}}
