/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import grid.Grid;
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

        graphics.fillRect(x + width * 20 / 100, y + height * 25 / 100, width * 60 / 100, height * 50 / 100);        //Body
        graphics.fillOval(x + width * 20 / 100, y + height * 1 / 100 , width * 60 / 100, height * 50 / 100);      //Head

        graphics.setColor(Color.BLACK);

//        graphics.drawOval(x, y, width, height);        //Nose
        graphics.fillOval(x + width * 60 / 100, y + height * 15 / 100, width * 5 / 100, height / 8);        //Right Eye 
        graphics.fillOval(x + width * 35 / 100, y + height * 15 / 100, width * 5 / 100, height / 8);        //Left Eye
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
    
    
    private Grid grid;
    private static final int ROWS = 10;
    private static final int COLUMNS = 10;
    
    private boolean design = false;

    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the design
     */
    public boolean isDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(boolean design) {
        this.design = design;
    }

}
