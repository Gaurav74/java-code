/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class awt1 extends Frame implements ActionListener{
    TextField tf;
    awt1(){
        tf=new TextField("");
        tf.setBounds(60,50,170,20);
        Button b=new Button("Click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
       tf.setText("WELCOME TO AWT");
    }
    public static void main(String args[]){
        awt1 a = new awt1();
    }
}
