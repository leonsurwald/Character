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

    private Diglett myDiglettBig, myDiglettSmall;

    public CharacterEnvironment() {

        myDiglettBig = new Diglett(200, 50, 400, 400);
        myDiglettSmall = new Diglett(0, 0, 100, 100);

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
        if (myDiglettBig != null) {
            myDiglettBig.setX(e.getX());
            myDiglettBig.setY(e.getY());
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (myDiglettBig != null) {
            myDiglettBig.draw(graphics);
        }

        if (myDiglettSmall != null) {
            myDiglettSmall.draw(graphics);
        }
    }

}
