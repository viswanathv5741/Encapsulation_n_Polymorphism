package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	double angle = Math.PI/4d;
	
	CircleMorph(double x, double y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect((int)x, (int)y, width, height);
		//System.out.println(width);
	
	}
	
	@Override
	public void update() {

   	 	x += (Math.cos(angle))*5d;
   	 	y += (Math.sin(angle))*5d;
   	 	angle += 0.2;		
	}
}
