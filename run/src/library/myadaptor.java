/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import library.adaptor1;

/**
 *
 * @author HP
 */
public class myadaptor extends KeyAdapter{
   adaptor1 ad;
    public myadaptor( adaptor1 ad){
        this.ad=ad;
}

        public void KeyPressed(KeyEvent key){
            ad.showStatus("this is working");        
    }
          
      
}
