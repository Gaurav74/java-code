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
public class inheritence {
   final int a=6;
    final int b=9;
    int c,d;
    inheritence(inheritence op){
   c=op.c;
   d=op.d;}
    inheritence(int cc,int dd){
        c=cc;
        d=dd;
  }
    void add(int c,int d){
        System.out.println("the c is"+c+" and d is"+d+"");
        }

    void ad(){
        System.out.print("add=");
       System.out.println(c+d);
    }
}
    class pol extends inheritence{
int o;
    pol(pol op) {
        super(op);
      o=op.o;
    }
    pol(int cc,int dd,int ss){
        super(cc,dd);
        ss=o;
    }

        void pool(){
            System.out.print("substract is");
            System.out.println(c-d);
        }
        void show(){
            System.out.println("the c="+c+"d="+d+"o="+o+"");
        }
        }
class ki{
public static void main(String args[]){
    pol x=new pol(1,2,9);
    pol k=new pol(2,9,8);
    x.show();
    k.show();
   x.c=1;
   x.d=4;
   x.ad();
   k.add(2,8);
   x.pool();
}
}
    

