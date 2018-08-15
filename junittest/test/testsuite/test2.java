/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAURAV
 */
public class test2 {
message msg=new message("kumar");    
    public test2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("in test2");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("out of test 2");
    }
@Test
public void test(){
    
    assertEquals(msg.name(),"kumar");
    
    
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
