/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author HP
 */
public class prsbuilder1 {
    public static void main(String args[]) throws Exception{
        System m = null;
//        System.out.println(m.getClass());
long t1=System.currentTimeMillis();
  System.out.println(m.getProperty("os.name")); 
  System.out.println(m.getProperty("os.version"));
  System.out.println(System.getProperty("user.dir"));
  System.out.println(m.getProperty("java.vendor"));
  char ar[]={'a','b','c','d'};
  char br[]={'k','k','k','k'};
  System.out.println(new String(ar));
  System.out.println(new String(br));
  System.arraycopy(ar, 0, br, 0,br.length);
   System.out.println(new String(ar));
  System.out.println(new String(br));
    long t2=System.currentTimeMillis();
    System.out.println(t2-t1);
    System.out.println(System.getProperties());  
  System.exit(0);//no output after this
   System.out.println("done");
  System.out.println("here");
    }
    
}
