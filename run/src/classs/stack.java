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
class stck{
 private int ary[];   
private int d;

stck(int i){
    ary =new int[i];
    int d=-1;
}
    void push(int i){
if(d==ary.length-1){
    System.out.println("not enough memory");
   }
else
    ary[d++]=d;}
    
     int pop(){
        if(d<0){
            System.out.println("under flow");
    return 0;
        }
        else 
        return ary[d--];
    }
    

}
public class stack {
    public static void main(String args[]){
        stck my =new stck(7);
        for(int e=0;e<7;e++){
            my.push(e);
        }
        for(int s=0;s<7;s++){
            System.out.println(my.pop());
        }
    }
    
}