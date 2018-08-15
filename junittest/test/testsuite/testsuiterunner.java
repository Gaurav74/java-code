/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author GAURAV
 */
public class testsuiterunner {

    public static void main(String[] args) {
        
Result result=JUnitCore.runClasses(testsuiteclass.class);

 result.getFailures().forEach((e)->{
    System.out.println(e.toString());
});
        System.out.println(result.wasSuccessful());
    }

    
}
