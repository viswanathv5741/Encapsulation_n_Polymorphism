package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    //Polymorph[] polys = new Polymorph[3];
  
//    Polymorph bluePoly;
//    Polymorph redPoly;
//    Polymorph movePoly;
//    Polymorph circlePoly;
//    Polymorph mousePoly;
    Polymorph imagePoly = new ImageMorph(50,50,50,50);
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	
   	 
//   	 polys[0] = new BluePolymorph(50, 50, 20, 40);
//   	 polys[1] = new RedPolymorph(80,80,20,40);
//   	 polys[2] = new MovingMorph(80,80,20,40);
//   	 circlePoly = new CircleMorph(50,50,10,10);
//   	 mousePoly = new MouseMorph(50,50,10,10);
   	
   	 
   	 this.addMouseListener((MouseListener) imagePoly);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
//   	 for (Polymorph p: polys){
//   		 p.draw(g);
//   	 }
//   	 circlePoly.draw(g);
//   	 polys[0].draw(g);
//   	 polys[1].draw(g);
//   	 polys[2].draw(g);
//   	 mousePoly.draw(g);
   	 imagePoly.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
//   	for (Polymorph p: polys){
//  		 p.update();
//  	 }
//   	circlePoly.update();
//   	 polys[0].update();
//   	 polys[1].update();
//   	 polys[2].update();
//   	 mousePoly.update();
   	 imagePoly.update();
    }
}
