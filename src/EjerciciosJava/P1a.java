package EjerciciosJava;

import EjerciciosJava.p2b.Pila;

public class P1a {

	public static int top(int[] s) {
		int a = 0;
		for(int i=0;i < s.length; i++) {
			if (s[i] != 0) {
				
				a++;
			
			}
		
		}
		return a;
	}
	
	public static int[] pilaPush(int[] s, int x) {
		
		String disponibilidad = "";
		int[] auxiliar = new int[s.length + 1];
		
		for(int i=0; i < s.length; i++) {
			
			auxiliar[i] = s[i];
			
			if(s[i] == 0) {
				auxiliar[i] = x;
				disponibilidad = "El numero " + x + " ha sido agregado al final de la pila, en la posicion " + i;
				break;
			}else {
				disponibilidad = "La pila esta llena";
			}
		}
		return auxiliar;
		

	}
	
	public static String pilaPop(int[] s) {
		
		if(s.length == 0) {
			System.out.println("Error, Pila sin datos");
		}
		for(int i=0; i < s.length; i++  ) {
			if(s[i] == 0) {
				s[i-1] = 0;
				break;
			}
		}
		
		return "El ultimo numero ha sido sacado";
		
	}
	
	public static String pilaEmpty(int[] a) {
		String vacia = "";
		for(int i=0;i < a.length; i++) {
			
			if(a[i] == 0) {
				
				vacia = "La pila esta completamente vacia";
				
			}else {
				vacia = "La pila no esta vacia";
				break;
			}
		}
		return vacia;
	}
	
	 public static void printPila(int[] pila){
	        if(pila.length == 0) {
	        	System.out.println("Error: Se encuentra vacia");
	        }
	        System.out.println("Datos dentro de la pila: ");
	        for(int i = 0; i < pila.length - 1; i++){
	            System.out.print(pila[i] + ", ");
	        }
	         System.out.println(pila[pila.length-1]);
	    }
	
	public static void main(String[] args) {
		
		int[] pilas= new int[10];
		
		
		printPila(pilas);
		System.out.println(pilaEmpty(pilas));
		   pilas = pilaPush(pilas, 9);
	        pilas = pilaPush(pilas, 1);
	        pilas = pilaPush(pilas, 5);
		System.out.println(pilaPop(pilas));
		System.out.println(" Cantidad de valores en la pila es: " + top(pilas));
		printPila(pilas);
	}
	
}
