/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author leonsurwald
 */
public class Diglett {

    public void draw(Graphics graphics) {

        graphics.drawRect(x, y, width, height);

        graphics.setColor(new Color(139,69,19, 255));

        graphics.fillRect(x + width / 5, y + height / 4, width * 3 / 5, height / 2);        //Body
        graphics.fillOval(x + width / 5, y + (height / 100000000), width * 3 / 5, height / 2);      //Head

        graphics.setColor(Color.BLACK);

//        graphics.drawOval(x, y, width, height);        //Nose
        graphics.fillOval(x + width / 20/9, y + height / 7, width / 20, height / 8);        //Right Eye 
        graphics.fillOval(x * 10/6, y + height / 7, width / 20, height / 8);        //Left Eye
//        graphics.drawOval(x, y, width, height);        //Left Pupil 
//        graphics.drawOval(x, y, width, height);        //Right Pupil
//        graphics.drawOval(x, y, width, height);             
    }

    public Diglett(int x, int y, int height, int width) {                  //Constructor

        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

    }

    private int x;
    private int y;
    private int height;
    private int width;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
