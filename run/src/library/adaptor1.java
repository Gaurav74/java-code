/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.applet.Applet;

/**
 *
 * @author HP
 */
public class adaptor1 extends Applet{
    
    public void init(){
        addKeyListener(new myadaptor(this));
    }
     
}

