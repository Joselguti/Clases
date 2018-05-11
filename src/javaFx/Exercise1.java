package javaFx;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JFrame;

public class Exercise1 extends Canvas {
	
	public static void main(String[] args) { 
		
		JFrame frame = new JFrame("My Drawing"); 
		Canvas canvas = new Exercise1(); 
		canvas.setSize(600, 400); 
		frame.add(canvas); 
		frame.pack(); 
		frame.setVisible(true); 
		canvas.setBackground(Color.white);
		
	}
	
	public void paint(Graphics g) {
		//g.setColor(Color.white);
		//g.fillRect(0, 0, 600, 400);

		g.setColor(Color.red);
		g.fillOval(250, 150, 100 , 100); 
		
	}
}
