/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author GAURAV
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({practice.test1.class,practice.test2.class})
public class suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    System.out.println("started");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    System.out.println("finished");
    }
    
}
