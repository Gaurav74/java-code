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
public class constructor1 {
    int a;
    String name;
    constructor1(int r,String d){
        a=r;
        name=d;
    }
    void show(){
        System.out.println("no="+a+"name="+name);
    }
    public static void main(String args[]){
       // constructor1 ad=new constructor1();
        constructor1 as[]=new constructor1[4];

          //constructor1 aa[]=new constructor1[4];;
                  as[1]=new constructor1(1,"ds");
                  as[0]=new constructor1(1,"dkl");
                  System.out.println(as.length);
                  as[1].show();
                   as[0].show();
    }
}
