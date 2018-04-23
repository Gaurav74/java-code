package classs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class breaks {
    public static void main(String args[]){
  int b=1,c=5;
 int a=1;
  if(a>4)
  for(;;){
     if(b>12)
         break;
      b++;
      System.out.println("b="+b);
     
  }
  else
  for(;;){
      if(c>12)
          break;
      c+=2;
      System.out.println("c="+c);
  }
    }
    
}
