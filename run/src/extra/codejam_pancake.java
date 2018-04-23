/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.util.*;

/**
 *
 * @author HP
 */
public class codejam_pancake {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=0,flip=0,range=0,temp=0;String input;boolean flag=true;
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            flip=0;temp=0;range=0;
            input=s.next(); flag=true;
            range=s.nextInt();
            char array[]=input.toCharArray();
            //while(temp!=array.length-1){ }
        for(int j=0;j<array.length;j++ ){
            if(array[j]=='+')
                continue;
            if(j>(array.length-range) && array[j]=='-'){
                     System.out.println("Case #"+i+": "+"IMPOSSIBLE");flag=false;
                      break; 
            }
           
            if(array[j]=='-'){
                for(int k=j;k<j+range;k++){
               if(array[k]=='+') array[k]='-';
                    if(array[k]=='-') array[k]='+';
                } 
                flip++;
            }}
         if(flag)
        System.out.println("Case #"+i+": "+flip);
        }
        }
         
      
    }
    

