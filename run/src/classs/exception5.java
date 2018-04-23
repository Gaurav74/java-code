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
public class exception5 {
    static void demo(){
        ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException("top layer");
    e.initCause(new ArithmeticException("it is real"));
    throw e;
    }
    public static void main(String args[]){
        try{
            demo();
        }
        catch(Exception e){
            System.out.println("error:"+e);
            System.out.println("error original:"+e.getCause()); 
        }
    }
}
