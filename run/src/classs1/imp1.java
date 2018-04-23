/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

/**
 *
 * @author HP
 */
public class imp1 {
    public class inu implements intrfcm{
        public void mymethod(int a,int b){
            System.err.println(a+b);
        }
        public void method2(String g){
            System.err.println(g);
        }
    }
    intrfcm n=new inu();
    intrfcm impint=new intrfcm(){
        public void mymethod(int a,int b){
            System.err.println(a+b);
        }
        public void method2(String j){
            System.err.println(j);
        } 
    }; 
   
   
    public static void main(String args[]){
        imp1 t=new imp1();
       
    }
}
