/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 *
 * @author HP
 */
public class binary2 {
    int inc=0;
    binary2(int q){
        int ary[]=new int[9];
        while(q!=0){
        int rem=q%2;
        ary[inc++]=rem;
        q=q/2;}
        int r=ary.length-1;
        System.out.print("binary of["+q+"]");
        for(int len=r;len>=0;len--){
            System.out.print(ary[len]);
       //reverse(ary);
       //for(int d:ary){
        //   System.out.println(d);
       }
    }
    public static void main(String args[]){
        binary2 b1=new binary2(7); 
        System.out.println();
   binary2 b2=new binary2(8);
    }
}
