/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Event;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class awt1 extends Frame implements ActionListener {
    TextField tf;Button ex;
    awt1()
    {
       tf= new TextField("");
    Button b=new Button("click");
   ex=new Button("Exit");
    ex.setBounds(300, 100, 50, 50);
    add(ex);
    tf.setBounds(50,90,90,50);
    b.setBounds(100,120,100,100);
    b.addActionListener(this);
    ex.addActionListener(this);
    add(tf);
    add(b);
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    }
    public static void main(String args[]){
    awt1 a=new awt1();
        
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("this is working");
       System.exit(0);
    }

   

}
