/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class dir1 {
    public static void main(String[] args ){
        File f=new File("G:\\");
        System.out.println(f.isDirectory());
        File[] g=f.listFiles();
        for(File r:g)
            System.out.println(r.toString());
        System.out.println(Arrays.toString(g));
    }
}
