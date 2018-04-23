
import java.util.ArrayList;
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
public class temp {
    public static void main(String args[]){
    /*ArrayList<String> a = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            a.add(scan.next());
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++) {
            int count = 0;
            String s = scan.next();
            for(String str : a) {
                if(str.equals(s))
                    count++;
            }
            System.out.println(count);
        }
*/
     Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int times=s.nextInt();
        ArrayList<Integer> array=new ArrayList<>(size);
        for(int k=0;k<size;k++)
            array.add(k,0);
        for(int i=0;i<times;i++){
            int a,b;
            a=s.nextInt();
            b=s.nextInt();
            int value=s.nextInt();
            for(int j=a-1;j<b;j++){
                int get=array.get(j)+value;
                array.set(j,get);
                
            }
        }
        int high=0;
        for(int temp:array){
            if(temp>high)
                high=temp;
        }
        System.out.println(high);
    }
}
