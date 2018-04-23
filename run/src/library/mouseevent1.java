/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class mouseevent1 extends Applet implements MouseListener,MouseMotionListener,KeyListener{
    String msg="",keymsg="";
    int virtualkey;
    int mousex=0,mousey=0;
    @Override
    public void init(){
    setBackground(Color.GRAY);
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    mousex=0;
    mousey=10;
    msg="clicked";
    repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {
     mousex=e.getX();
     mousey=e.getY();
     msg="down";
     repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
     mousex=e.getX();
     mousey=e.getY();
     msg="up";
     repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    mousex=0;
    mousey=10;
    msg="mouse entered";
    repaint();
    }
    @Override
    public void mouseExited(MouseEvent e) {
       mousex=0;
       mousey=10;
       msg="mouse exited";
       repaint();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
       mousex=e.getX();
       mousey=e.getY();
       msg="*";
       showStatus("dragging mouse is at "+mousex+" : "+mousey);
       repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        showStatus("mouse is moving at "+e.getX()+" : "+e.getY());
    }
    @Override
    public void keyTyped(KeyEvent e) {
        keymsg+=e.getKeyChar();
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
         showStatus("key up");
         virtualkey=e.getKeyCode();
    switch(virtualkey){
        case KeyEvent.VK_F1:
        keymsg+="F1";
        break;
        case KeyEvent.VK_F2:
        keymsg+="F2";
        break;
        case KeyEvent.VK_CAPS_LOCK:
            keymsg+="caps lock";
            break;
    }
         repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
         showStatus("key down");
         repaint();
    }
    @Override
    public void paint(Graphics g){
    g.drawString(msg, mousex,mousey);
    g.drawString(keymsg, 10,100);
    }   
    }