/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.util.HashSet;



/**
 *
 * @author HP
 */
public class hash_set {
    public static void main(String args[]){
        HashSet<String> h1=new HashSet<String>();
        h1.add("hi");
        h1.add("there");
        h1.add("here");
        System.out.println(h1);
        try{
        System.out.println(h1);}
        catch(Exception e){
        System.out.println(e);
        }
        h1.remove("hi");
        System.out.println(h1);
    }

   
}
