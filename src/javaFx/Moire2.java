package javaFx;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire2 extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        Canvas canvas = new Moire2();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        int i = 0;
        double x = 0;
        while (i < 72) {
        	
            g.drawLine( (int) (200+ Math.cos(Math.toRadians(x)) * 400), (int) (200+ Math.sin(Math.toRadians(x)) * 400)  , 200, 200);
            i = i + 1;
            x = x + 5;
            
        }
    }
 

}