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
 class statik {
    int a=2;
    int b=3;
    static void po(){
        System.out.println("hi");
    }
   // static{
      //  int a=a+2;
       // int b=b+1;
       //    }
     void kol(){
    poi pol=new poi();
        pol.ki();
}
    class poi{
         void ki(){
             int d=a;
             int g=b;
         System.out.println("a="+d+",b="+g+"");   
           }
    }
}
   
class show{
    public static void main(String args[]){
        statik k=new statik();
        k.po();
        k.kol();
    }
}