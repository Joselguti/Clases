package EjerciciosJava.Chapter4;

public class Exercise41 {
	public static void zoop() {
		baffle(); 
		System.out.print("You wugga "); 
		baffle(); 
	}
	
	public static void main(String[] args) { 
		System.out.print("No, I "); 
		zoop(); 
		System.out.print("I "); 
		baffle(); 
	}
	
	public static void baffle() { 
		System.out.print("wug"); 
		ping(); 
	}
	
	public static void ping() { 
		System.out.println("."); 
		
	}
}

// Primero en el main existe un print que es "No, I", luego a este se le suma Zoop que realizar primero baffle
// el cual hace rpint de wug, luego aun dentro de zoop se hace un print de "you wugga" junto a baffle denuevo
// que imprime otro wug, terminando este zoop() existe otro print de "I" dentro de main para luego realizar baffle 
// nuevamente que realiza wug junto a ping que es el punto.

// "no I" -> zoop() -> baffle -> "wug" + ping() -> "." -> zoop() -> "I" -> baffle() -> "wug" + ping() -> "."

// Si ponemos un baffle() dentro de ping seria un loop inifinito entre baffle y ping.