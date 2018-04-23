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
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class xml_encode_manual implements Serializable {
    public static void main(String[] args) {
        try{
         XMLEncoder e = new XMLEncoder(
                          new BufferedOutputStream(
                              new FileOutputStream("Test.xml")));
       e.writeObject(new JButton("Hello, world"));
      e.writeObject(new JLabel("gaurav"));
       e.close();
    }
        catch(FileNotFoundException e){}
}
}
