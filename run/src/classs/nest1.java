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
public class nest1 {
    void lol(){
         pool po=new pool();
         po.poool();
        }
            class pool{
           void poool(){
                for(int i=0;i<9;i++)
         System.out.println("how is this");
        }
        }
}
class pop{
    public static void main(String args[]){
        nest1 net=new nest1();
        net.lol();
    }
    
}
