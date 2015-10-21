/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author leonsurwald
 */
class CharacterEnvironment extends Environment {

    Diglett myDiglett;
    
    public CharacterEnvironment() {
    
    myDiglett = new Diglett(200, 50, 200, 200);
    
    }
    

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
       
        
        if (myDiglett != null){
            myDiglett.draw(graphics);
        }
    }
    
}
