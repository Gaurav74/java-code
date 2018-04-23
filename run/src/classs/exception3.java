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
public class exception3 {
    static void exp1() throws ArithmeticException{
        int a=0,d;
        d=2727/a;
        
        throw new ArrayIndexOutOfBoundsException("error came");
    }
    public static void main(String args[]){
        try{
            exp1();
    } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
        finally{
            System.out.println("complete");
        }
    }
}
