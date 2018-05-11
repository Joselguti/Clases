package javaFx;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.sun.javafx.geom.Rectangle;

public class Exercise2 extends Canvas{
	
	public static void main(String[] args) { 
		
		JFrame frame = new JFrame("My Drawing"); 
		Canvas canvas = new Exercise2(); 
		canvas.setSize(600, 400); 
		frame.add(canvas); 
		frame.pack(); 
		frame.setVisible(true); 
		canvas.setBackground(Color.white);
		
		
	}
	
	public void paint(Graphics g) {
	 
		Rectangle half = new Rectangle(200, 150, 200, 200);
		mickey(g, half);
		
	}
	public void boxOval(Graphics g, Rectangle bb) 
	{ 
		g.fillOval(bb.x, bb.y, bb.width, bb.height); 
	}
	
	public void mickey(Graphics g, Rectangle bb) 
	
	{ 
		boxOval(g, bb);
		int dx = bb.width / 2; 
		int dy = bb.height / 2; 
		Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
		half.translate(-dx / 2, -dy / 2); 
		if((dx >= 3) && (dy >= 3)){
		mickey(g, half);
		half.translate(dx * 2, 0); 
		mickey(g, half);
		}
	}
	
	
}
