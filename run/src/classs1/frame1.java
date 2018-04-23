/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class frame1 implements ActionListener{
    public static void main(String[] args ){
        JFrame frame=new JFrame("my frame");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();
        frame.setBackground(Color.GREEN);
        frame.setBounds(100, 100,500, 500);
        c.setBackground(Color.red);
       System.out.println( c.getLocation());
       JButton b=new JButton("add");
       c.add(b);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
