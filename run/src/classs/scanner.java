/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class scanner {
    public static void main(String args[]){
        //JOptionPane.showMessageDialog("which integration you want");
        System.out.println("1...x^2");
        System.out.println("2...x^3");
       int a=0;
       int b,c = 0,d;
       System.out.println("please enter the choice");
       Scanner bb=new Scanner(System.in);
       b=bb.nextInt();
       System.out.println("please enter the number");
       Scanner dd=new Scanner(System.in);
       d=dd.nextInt();
      switch(b){
          case 1:
            c=d*d;
            break;
          case 2:
              c=d*d*d;
      }
      System.out.println(c);
    }
    
}
