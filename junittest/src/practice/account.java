/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author GAURAV
 */
public class account {
     float balance;
    
    public account(){
        balance=0.0f;
    }
    
    public void deposit(float money){
        balance+=money;
    }
    
    public void withdraw(float money){
        balance-=money;
        
    }
    
    public float balance(){
        
        return balance;
    }
    
    
    
public static void main(String args[]){
    
    
    
    
}
}
