package EjerciciosJava.Exercise1;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet {
	
	public void paint(Graphics g) {
		g.drawString("Hello! How are you doing?", 10, 10);
	}
}

