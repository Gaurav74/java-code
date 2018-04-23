/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

/**
 *
 * @author HP
 */
public class varag {
    static void po(int ary[]){
        System.out.print("the array length"+"  "+ary.length+"  "+"components are");
      //  for(int i=0;i<ary.length;i++)
      for(int x : ary)
            System.out.print(x+" ");
       System.out.println(" ");
    }
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={2,3,43};
        po(a);
        po(b);
}
}
