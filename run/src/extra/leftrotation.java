/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class leftrotation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        
        int rot=s.nextInt();
        final int sizet=size;
        int array[]=new int[sizet]; 
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        for(int j=0;j<rot;j++){
            int temp=array[0];
            for(int q=0;q<size-1;q++){
                //int temp1=
                array[q]=array[q+1];
                
            }
            array[size-1]=temp;
        }
        for(int a:array){
            System.out.print(a+" ");
        }
    }
}
