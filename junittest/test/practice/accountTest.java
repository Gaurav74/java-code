/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAURAV
 */
public class accountTest {
    
    public accountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deposit method, of class account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        float money = 22.3F;
        account instance = new account();
        instance.deposit(money);
        float balance=instance.balance();
        assertEquals(money,balance,0.00F);
    }

    /**
     * Test of balance method, of class account.
     */
    @Test
    public void testBalance() {
        System.out.println("balance");
        account instance = new account();
        float expResult = 0.0F;
        float result = instance.balance();
        assertEquals(expResult, result, 0.00F);
        
    }

    /**
     * Test of main method, of class account.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        account.main(args);
      
    }

    /**
     * Test of withdraw method, of class account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        float money = 34.5F;
        account instance = new account();
        instance.withdraw(money);
       float balance=instance.balance();
       assertEquals(-money,balance,0.00F);
    }
    
}
