package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ImageMorph extends Polymorph implements MouseListener{
	Image penguin = null;
	ImageMorph(double x, double y, int width, int height) {
		super(x, y, width, height);
		try {
			penguin = ImageIO.read(new File("/Users/league/Desktop/penguin.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(penguin, (int)x, (int)y, width, height, null);
		g.setColor(Color.CYAN);
		g.fillRect((int)x, (int)y, 2, 2);
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX() >= x && e.getX() <= x + width && e.getY() >= y && e.getY() <= y + height) {
			JOptionPane.showMessageDialog(null, "Clicked the penguin");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
