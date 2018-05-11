package javaFx;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        Canvas canvas = new Moire();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        int i = 10;
        while (i < getWidth()) {
        	
            g.drawOval(200 - i , 200 - i  , 1 +i*2 , 1+i*2);
            i = i + 5;
        }
    }
 

}