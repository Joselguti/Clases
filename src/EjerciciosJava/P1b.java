package EjerciciosJava;

public class P1b {


	public static void dividirPilas(int[] a, int pila1[], int pila2[]) {
		int mitad = a.length/2;
		
		int mitadmenosuno = mitad - 1;
		
		for(int i = 0; i < mitadmenosuno; i++) {
			
			pila1[i] = a[i];
		}
		for(int i = mitad; i < a.length; i++) {
			
			pila2[i - 10] = a[i];
		}
	}

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
		
		int[] pilas= new int[20];
		int[] pila1= new int[10];
		int[] pila2= new int[10];

		for(int i = 0; i < pilas.length;i++) {
			pilas[i] = (int) (Math.random() * 20);
		}
		
		dividirPilas(pilas, pila1, pila2);
		  int largos = pila1.length + pila2.length;
		for(int i=0; i < pila1.length; i++) {
		
			System.out.println("La pila 1 tiene estos datos" + pila1[i]);	
			
		}
		for(int i=0; i < pila2.length; i++) {
			  
			
				System.out.println("La pila 2 tiene estos datos" + pila2[i]);
				
		}
		System.out.println("La suma de ambos largos de los arreglos es " + largos );
		
		
	}
}
