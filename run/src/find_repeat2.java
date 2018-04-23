
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
public class find_repeat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s=new Scanner(System.in);
         /*
         very wrong method
         1.if values are very large and short ...it will not work
         2.if the values have same remainder then wrong number will be found
         */
         
        int size=s.nextInt();     
        int array[]=new int[size];
        int alt[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=alt[i]=s.nextInt();
        }    //not for large values
        for(int a=0;a<array.length;a++){
          array[array[a]%array.length]+=array.length;
        }
        int max=-1,pos=0;
        for(int a=0;a<array.length;a++){
           
            if(array[a]>max){
                max=array[a];
                pos=a;
            }
        }
        System.out.println(pos);
    }
    
}
