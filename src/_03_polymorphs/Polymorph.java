package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected double x;
    protected double y;
    protected int width;
    protected int height;
    
    Polymorph(double x, double y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){

    }
    
    public abstract void draw(Graphics g);
}
