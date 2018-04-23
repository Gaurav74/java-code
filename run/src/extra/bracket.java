/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class bracket {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a = 0; a < t; a++){
           // Scanner in = new Scanner(System.in);
        String s =" ";
        s=in.next();
         char arr[]=s.toCharArray();
         if(arr==null)
             System.out.println("YES");
        int i=0,j=arr.length-1;
        if((arr.length)%2==0){
        while(i<j){
            if(arr[i]==arr[j]){
                i++;j--;}
            else{
                System.out.println("NO");
                break;
            }
        }
        }
        else{
            System.out.println("NO");
        }
        if(i>j)
            System.out.println("YES");
        }
    }
}
