/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.io.FileInputStream;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class file1 {
    public static void main(String args[]) throws IOException{
        
     
             int  inp = 0,i = 0;
      try(FileOutputStream f=new FileOutputStream("G:\\file1.txt")){
          while(inp!=6){  
        Scanner input=new Scanner(System.in);
        inp=input.nextInt();
        f.write(inp);
        }}
      catch(Exception e){
          System.out.println(e);
      }
      
      try(FileInputStream f=new FileInputStream("G:\\file1.txt");
              FileOutputStream o=new FileOutputStream("G:\\file11.txt")){
          while(i!=-1){
          i=(char)f.read();
          System.out.println("num is="+i);
          o.write((char)i);
      }}
      catch(Exception e){
          System.out.println(e+"at second");
      }
    }
}
