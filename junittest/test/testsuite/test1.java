/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuite;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author GAURAV
 */
public class test1 {
     message msg=new message("gaurav");
    public test1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("in test1");   
   
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("out of test1");
    }

    @Test
    public void test(){
        assertEquals(msg.name(),"gaurav");
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
