/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class pattern_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //below \\d[exp] only accepts one char in matcher so the ? + * is necessary to show no of chars
        Pattern p=Pattern.compile("\\d+");//in pattern class method matches(string regex,CharSequence){
        Matcher m=p.matcher("54");        //above and present line is already defined
        System.out.println(m.matches()); // use above method
        System.out.println(Pattern.matches("[0-9]","1254"));
        System.out.println(Pattern.matches("[0-9]{5}","54565"));
        System.out.println(Pattern.matches("[0-9]*","5456"));
        System.out.println(Pattern.matches("[a-zA-Z ]*","gaurav kumar"));
        System.out.println(m.group());
        
    }
    
}
