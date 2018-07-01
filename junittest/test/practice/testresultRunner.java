/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author GAURAV
 */
public class testresultRunner {

public static void main(String args[]){
    
    Result result=JUnitCore.runClasses(testresultclass.class);
        result.getFailures().forEach((failure) -> {
        System.out.println(failure.toString());
    });
    
    System.out.println(result.wasSuccessful());
}

    
}
