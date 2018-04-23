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
public class arraysort {
    int t=-1;
    public static void main(String args[]){
        arraysort s=new arraysort();
int ary[]=new int[6];
ary[0]=7;
ary[1]=3;
ary[2]=0;
ary[3]=8;
ary[4]=4;
ary[5]=9;
for(int e:ary){
System.out.println(e);
}
System.out.println("now");
int y=ary.length;
for(int i=0;i<ary.length;i++)
    for(int w=i+1;w<ary.length;w++){
        
       if(ary[i]>ary[w]){
           int h;
           h=ary[i];
           ary[i]=ary[w];
           ary[w]=h;
       }
    }
        for(int e:ary){
System.out.println(e);
}
    
    }
}
