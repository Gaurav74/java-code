/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tg1 {
     public static void main(String args[] ) throws Exception {

	//Write code here
	   Scanner s=new Scanner(System.in);
        //Scanner ss=new Scanner(System.in);
	int count=0;
        int str=s.nextInt();
        ArrayList<String> array=new ArrayList<>(str);
        s.next();
        for(int i=0;i<str;i++){
            
           array.add(s.nextLine());
         }
      // s.next();
        int snum; 
         snum = s.nextInt();
        //s.next();
        for(int j=0;j<snum;j++){
            count=0;
            String search=s.nextLine();
           // s.next();
            for(String find:array){
                if(search.equals(find))
                    count++;
            }
            System.out.println(count);
            s.next();
        }
     }
}
