/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author leonsurwald
 */
public class Diglett {

    public void draw(Graphics graphics) {

        graphics.drawRect(x, y, width, height);
 
        
        graphics.setColor(new Color(139, 69, 19, 255));

        graphics.fillRect(x + width * 20 / 100, y + height * 25 / 100, width * 60 / 100, height * 55 / 100);       //Body
        graphics.fillOval(x + width * 20 / 100, y + height * 1 / 100, width * 60 / 100, height * 50 / 100);      //Head

        graphics.setColor(Color.BLACK);

        graphics.fillOval(x + width * 60 / 100, y + height * 15 / 100, width * (5) / 100, height * 14 /100);        //Right Eye 
        graphics.fillOval(x + width * 35 / 100, y + height * 15 / 100, width * (5) / 100, height * 14 / 100);        //Left Eye
        
        
        graphics.setColor(Color.WHITE);
        
        graphics.fillOval(x + width * 61 / 100, y + height * 17 / 100, width * (5/2) / 100, height * 4 / 100);        //Right Pupil 
        graphics.fillOval(x + width * 36 / 100, y + height * 17 / 100, width * (5/2) / 100, height * 4 / 100);         //Left Pupil
        
        graphics.setColor(Color.BLACK);
        
        graphics.fillOval(x + width * 42 / 100, y + height * 41 / 100, width *  22 / 100, height * 8 / 100);
        

        graphics.setColor(new Color(255, 105, 180, 255));
        
        graphics.fillOval(x + width * 36 / 100, y + height * 35 / 100, width *  26 / 100, height * 10 / 100);           //Nose
        
        
        graphics.setColor(new Color(255, 255, 255, 254));
        
        graphics.fillOval(x + width * 38 / 100, y + height * 35 / 100, width *  7 / 100, height * 7 / 100);           //Nose

        
        
//        if (design) {
//            grid.paintComponent(graphics);
//        }

    }

    public Diglett(int x, int y, int height, int width) {                  //Constructor

        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

        grid = new Grid(ROWS, COLUMNS, width / ROWS, height / COLUMNS, new Point(x, y), Color.BLUE);
        design = true;

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
        this.grid.getPosition().x = x;
    }

    public void setY(int y) {
        this.y = y;
        this.grid.getPosition().y = y;
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
