/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author GAURAV
 */
public class testresultclass extends TestResult {
    
    public synchronized void addError(Test test,Throwable t){
        super.addError((junit.framework.Test)test, t);
        }
    
    public synchronized void addFailure(Test test,AssertionFailedError error){
        super.addFailure((junit.framework.Test)test,error);
        
    }
    
    @Test
    public void test(){
        assertEquals(2,2);
    }
    
    
}
