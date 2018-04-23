/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class xmlencoder {
    public static void main(String[] args){
        try{
        myclass my_class=new myclass();
        
        FileOutputStream fout=new FileOutputStream("first.xml");
            try (XMLEncoder xml = new XMLEncoder(new BufferedOutputStream(fout))) {
                xml.setExceptionListener((Exception e) -> {
                    System.out.println(e.toString());
                });
                xml.writeObject(new JPanel());
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
   
}
