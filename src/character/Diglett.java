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

    public void draw(Graphics graphics){
        
        graphics.drawRect(x, y, width, height);
        
        graphics.setColor(new Color(128, 0, 0, 255));
        
        graphics.fillRect(x + width / 5, y + height / 4, width * 3 / 5 , height / 2);        //Body
        graphics.fillOval(x + width / 5, y + (height / 35), width * 3 / 5, height / 2);
         
//        graphics.drawOval(x, y, width, height);        //Head
//        graphics.drawOval(x, y, width, height);        //Nose
//        graphics.drawOval(x, y, width, height);        //Right Eye 
//        graphics.drawOval(x, y, width, height);        //Left Eye
//        graphics.drawOval(x, y, width, height);        //Left Pupil 
//        graphics.drawOval(x, y, width, height);        //Right Pupil
        
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

}
