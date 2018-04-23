/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class hexdecimalip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // input 172.18.29.118
        try{
        Scanner s=new Scanner(System.in);
          System.out.println("enter the ipv4 address");
        String input=s.nextLine();
        String decimal[]=new String[4];
        decimal=input.split(Pattern.quote("."));
        int i=0,j=0;String hexa="",binary="",hexToInt="",binaryfinal="";
        for(String q:decimal){
          hexa=hexa+Integer.toHexString(Integer.parseInt(q))+".";
          binary=Integer.toBinaryString(Integer.parseInt(q));
           binary=String.format("%07d",Integer.parseInt(binary));
           binaryfinal=binaryfinal+binary+".";
        }
        hexa= (hexa.substring(0,hexa.length()-1)).toUpperCase();
        binaryfinal=binaryfinal.substring(0,binaryfinal.length()-1);
        System.out.println("the hexa value of "+input+" is "+hexa);
System.out.println("the binary value of "+input+" is "+binaryfinal);        
//now hexa to decimal
        String hexinput=hexa;
        String hexarray[]=new String[4];
        hexarray=hexinput.split(Pattern.quote("."));
        for(String q:hexarray){
         hexToInt=hexToInt+Integer.toString(Integer.parseInt(q,16))+".";
        }
        hexToInt=hexToInt.substring(0,hexToInt.length()-1);
        System.out.println("The decimal value of "+hexa+" is "+hexToInt);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
