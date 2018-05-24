package EjerciciosJava.Chapter10;
import java.awt.Point;
import java.awt.Rectangle;

public class Exercise10_3 {
	
	public static void printPoint(Point p) { 
		
		System.out.println("(" + p.x + ", " + p.y + ")"); 
		
	}
	
	public static Point findCenter(Rectangle box) { 
		
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2; 
		return new Point(x, y); 
		
	}
	
	public static void main(String[] args) { 
		
		Rectangle box1 = new Rectangle(2, 4, 7, 9); 
		Point p1 = findCenter(box1); 
		printPoint(p1);
		box1.grow(1, 1); 
		Point p2 = findCenter(box1); 
		printPoint(p2);
		
	}

} // COmienza creando un objeto box 1 de tipo rectangle, (.x = 2 , .y = 4,  width= 7, height= 9), luego usa
// crea un objeto tipo point p1 que posee valores de findcenter que busca en centro de box1, (5,8)
// Luego hace uso de .grow que le hace resize a este en 1 y 1, es decir pasa de ser (2,4) a (1,3)
// luego crea el objeto p2 que es el centro de las nuevas coordenadas, dado que el box1 disminuyo en 1 en ambas cord
// el valor deberia ser el mismo. Ambos objetos poseen el mismo valor, pero no por eso son el mismo objeto.
// p1 sigue siendo completamente independiente de p2.