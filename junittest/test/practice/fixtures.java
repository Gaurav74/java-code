/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author GAURAV
 */
public class fixtures {
    static int value=0;
    public fixtures() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("before class");
    }
    
    @Test
    public void test(){
        System.out.println(" inside the test  ");
    }
    
    @AfterClass
    public static void tearDownClass() {
    System.out.println("after class");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
