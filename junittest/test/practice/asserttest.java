/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author GAURAV
 */
public class asserttest {
    
     static String name="Gaurav Kumar";
       static int val=9;
    public asserttest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Before
    public void setUp(){
      
    }
    
    @Test
    public void test(){
    
        assertEquals("Gaurav Kumar",name);
        
        assertTrue(5<val);
        assertFalse(7>val);
        assertNotNull(val);
        assertNull(null);
    //fail();        
    }
}
