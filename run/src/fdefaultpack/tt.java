package fdefaultpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class tt {
    public static void swap(int s,int y){
        int g;
        g=s;
        s=y;
        y=g;
    }
    public static int ca(int a,int b,int c,int d ){
        int i = 0,j = 0,total = 0,k=1;
        while(k!=5){
            switch(k){
                case 1:
                    i=a;j=c;                   
                    break;
                case 2:
                    i=a;j=d;
                    break;
                case 3:
                    i=b;j=c;
                    break;
                case 4:
                    i=b;j=c;
                    break;
            }
            k++;
        while(i!=1 &&j!=1){
            total+=1;
            int mod=(i%j);
            
            if(i==j){
            total+=1;
                break;
            }
            i=i-mod;
            if(i<j){
               swap(i,j);
               if(i==2&& j==1){
                   total=total+2;
                   break;
               }
            }
        }
        }
        return total;
 
    }
    public static void main(String args[]){
        int sa=ca(6,5,3,4);System.out.println(sa);
    }
}
