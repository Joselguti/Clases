package EjerciciosJava.Chapter10;
import java.awt.Point;


public class Exercise10_1 {
	
	public static int riddle(int x, Point p) { 
		x = x + 7; return x + p.x + p.y; 
	}
	
	public static void main(String[] args) {
		
		int x = 5; 
		
		Point blank = new Point(1, 2);
		
		System.out.println(riddle(x, blank)); 
		
		System.out.println(x);
		
		blank.x = blank.x + 2; // Mutable
		
		System.out.println(blank.x); 
		
		System.out.println(blank.y);
		
	}

}

// Crea la int x que vale 5 luego crea el un objeto point de nombre blank, luego hace uso de riddle
// que deja x en 12 y devuelve 12+ 1 + 2 (1 y 2 son x e y de blank) = 15 
// Luego hace print a x que es 5, hace print a blank x que es 1 y blank.y que es 2
// es mutable ya que en cualquier momento podemos redefinir los valores de este objeto