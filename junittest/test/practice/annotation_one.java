/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author GAURAV
 */
public class annotation_one {
    
   static int classcount=1;
        static int method_count=1;
        
    public annotation_one() {
        
        
    }
    @Ignore
    public static void tearDownClass1() {
    System.out.println("while closing class : " + (classcount++));
    }
    @BeforeClass
    public static void setUpClass() {
        System.out.println("while setting class : " + (classcount++));
    }
    
    
    
    @Test
    public  void test1(){
        System.out.println("in the method1");
    }
    
    @Test
    public  void test2(){
        System.out.println("in the method2");
    }
    
    @Test
    public  void test3(){
        System.out.println("in the method3");
    }
    
    @Test
    public  void test4(){
        System.out.println("in the method4");
    }
    
    
    
    
    @Before
    public void setUp() {
        System.out.println("while setting method : " + (method_count++));
    }
    
    @After
    public void tearDown() {
    System.out.println("while closing method : " + (method_count++));
    }

    @AfterClass
    public static void tearDownClass() {
    System.out.println("while closing class : " + (classcount++));
    }
     
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
