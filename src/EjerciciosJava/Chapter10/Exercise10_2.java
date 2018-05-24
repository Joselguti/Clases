package EjerciciosJava.Chapter10;
import java.awt.Point;
import java.awt.Rectangle;

public class Exercise10_2 {
	
	public static double distance(Point p1, Point p2) { 
		int dx = p2.x - p1.x; 
		int dy = p2.y - p1.y; 
		return Math.sqrt(dx * dx + dy * dy); 
	}
	
	public static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2; 
		return new Point(x, y); 
	}
	
	public static void main(String[] args) { 
		
		Point blank = new Point(5, 8);
		Rectangle rect = new Rectangle(0, 2, 4, 4); 
		Point center = findCenter(rect);
		double dist = distance(center, blank); 
		System.out.println(dist);
	}
	
}

// El diagrama de flujo de este seria el siguiente, Primeor crea el objeto de tipo point blank que .x = 5 y .y = 8
// al mismo tiempo crea un obj tipo rectangulo rect (x = 0, y = 2, width = 4 , height = 4) (En realidad es un cuadrado)
// Luego crea otro objeto tipo Point llamado center que busca el centro a rect, el cual deberia ser 2, 4
// luego crea un double donde guarda el valor de la distancia entre el point center y blank e imprime esta distancia
// que tiene un valor de 5
