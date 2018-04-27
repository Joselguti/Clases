package EjerciciosJava;



public class P1a {
	

	public static int top(int[] a) {
		
		return (a.length - 1);
	}
	
	public static String pilaPush(int[] s, int x) {
		
		String disponibilidad = "";
		
		for(int i=0; i < s.length; i++) {
			
			if(s[i] == 0) {
				s[i] = x;
				disponibilidad = "El numero " + x + " ha sido agregado al final de la pila " + " En la posicion " + i;
				break;
			}else {
				disponibilidad = "La pila esta llena";
			}
		}
		return disponibilidad;
		

	}
	
	public static String pilaPop(int[] s) {
		
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
	
	public static void main(String[] args) {
		
		int[] pilas= new int[10];
		pilas[0] = 15;
		pilas[1] = 6;
		pilas[2] = 2;
		pilas[3] = 9;
		pilas[4] = 0;
		pilas[5] = 0;
		pilas[6] = 0;
		pilas[7] = 0;
		pilas[8] = 0;
		pilas[9] = 0;

		
		System.out.println(pilaEmpty(pilas));
		System.out.println(pilaPush(pilas, 4));
		System.out.println(pilaPop(pilas));
		System.out.println(top(pilas));
	}
	
}
