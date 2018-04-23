package fdefaultpack;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class datatypecheck {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
         String g=s.nextLine();
        try{
            int y=Integer.parseInt(g);       
            System.out.println("This is of type Integer");          
           }
        catch (NumberFormatException e){
            try{
                float f=Float.parseFloat(g);
                System.out.println("this is float");
            }
            catch(NumberFormatException ex){
                System.out.println("This is of type String" );
            }            
            }
            }
}
