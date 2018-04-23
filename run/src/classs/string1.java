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
public class string1 {
    public static void main(String args[]){
        String name="Gaurav";
        System.out.println("name(upper case): "+name.toUpperCase());
 //String a[]=name.split(name,2);
 //System.out.println(a);
 String name1=name.replace('a','s');
 String name2="friend";
 System.out.println("after replacing: "+name1); 
 StringBuffer re=new StringBuffer("i am");
 re.insert(2,"fi");
 System.out.println("after inserting: "+re);
 System.out.println("index of a: "+name.indexOf('a'));
 //System.out.println(name.indexOf('s'));
 System.out.println("index of ra: "+name.indexOf("ra"));
 System.out.println("Last index of v: "+name.lastIndexOf('v'));
 System.out.println("after comparing "+name.compareTo(name2));
 System.out.println(name.compareToIgnoreCase(name2));
 System.out.println("Reversing:"+re.reverse());
String ad=name.substring(2,4);
String sh=name.substring(1);
System.out.println("substring: "+sh);
System.out.println("Substring: "+ad);
 System.out.println("name start with Ga: "+name.startsWith("Ga"));
 char[] ha=name.toCharArray();
 for(char t:ha)
     System.out.print(t+"+");
 //char[] hx=new char[6];
 //name.getChars(0, 6, hx, 0);
 }
}
