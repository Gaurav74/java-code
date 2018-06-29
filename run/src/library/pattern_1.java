/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class pattern_1 {

    /**
     * @param args the command line arguments
     */
    
    public boolean matching(){
        
           Scanner s=new Scanner(System.in);
        int a=0;boolean bool=true;
        System.out.println("Enter your choice\n1.STRING\n2.NUMBER");
        a=s.nextInt();
        if(a==1){
            System.out.println("Enter your text");
            String input=s.next();
            if(Pattern.matches("\\w",input)){
                bool=true;
            }
            else{
                bool=false;
            }
          
        }
        return bool;
    }
    public static void main(String[] args) {
        // TODO code application logic here
     
      // System.out.println(Pattern.matches("\\d", "1"));
   // System.out.println(Pattern.matches("\\d","5454"));
      //  System.out.println(Pattern.matches("\\w","sd5"));
        //now the number
        /*
        if(a==2){
             System.out.println("Enter your Number");
           String inputInt=s.next();
            if(Pattern.matches("\\d",inputInt)){
                System.out.println("It is Number");
            }
            else{
                System.out.println("It is not Number");
            }
        }*/
    }
    
}
