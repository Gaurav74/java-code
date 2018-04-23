/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class palindrome {

    /**
     * @param args the command line arguments
     */
    boolean palindromeTest(String input){
        boolean test=input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
        return test;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        palindrome p=new palindrome();
        if(p.palindromeTest(input)){
            System.err.print("this is palindrome");
        }
        else{
            System.err.print("This is not palindrome");
        }
    }
    
}
