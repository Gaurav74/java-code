/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author GAURAV
 */
public class tetCaseclass extends TestCase{
    
    @BeforeClass
    public void setUp(){
    
    }
    
    @AfterClass
    public void tearDown(){
        
    }
    
    @Test
    public void test(){
    System.out.println(this.countTestCases());
    
    System.out.println(this.getName());
    
    this.setName("gaurav test case");
    System.out.println(this.getName());
    
    TestResult t=this.createResult();
    System.out.println(t.wasSuccessful());
    
    
    
    
    }
    
    @Test
    public void test1(){
        System.out.println();
    }
    
}
