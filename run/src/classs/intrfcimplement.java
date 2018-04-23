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
public class intrfcimplement implements Intrfc {
int a=4,b=6,c;
String add="Sum is=";
    
    public void display() {
        System.out.println(add+c);
            }

    
    public void sum() {
        c=a+b;
            }
    public static void main(String args[]){
        intrfcimplement imp=new intrfcimplement();
        imp.sum();
        imp.display();
    }
    
}
