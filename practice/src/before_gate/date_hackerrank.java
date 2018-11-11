/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package before_gate;

/**
 *
 * @author GAURAV
 */
public class date_hackerrank {
    static String dayOfProgrammer(int year) {
        if(year==1918){
      return "28.10.1918";  
    } 
   if(year<1918 && year/4==0){
       return "12.09."+String.valueOf(year);
   }else
   if(year>1918 && (year/400==0 ||(year>1918)&& (year/4==0 && year/100!=0))){
       return "12.09."+String.valueOf(year);
   }
        else{
      return "13.09."+String.valueOf(year); 
   }
//return "";
    }
    public static void main(String[] args) {
        System.out.println( dayOfProgrammer(1900));
    }
}
