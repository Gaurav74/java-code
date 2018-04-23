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
public class peri extends area {
 int a,b;
 public peri(int length,int breadth){
     super(length,breadth);
     this.length=length;
     this.breadth=breadth;
     int c=2*(this.length+this.breadth);
     System.out.println("peri= "+c);
 }
}
