package EjerciciosJava;

public class Exercise85 {
 public static boolean[] sieve(int n) {
	 
	 boolean[] arreglo = new boolean[n];
	 int[] numerosPrimos = new int[20];
	 	
	 	numerosPrimos[0] = 1;
	 	numerosPrimos[1] = 2;
	 	numerosPrimos[2] = 3;
	 	numerosPrimos[3] = 5;
	 	numerosPrimos[4] = 7;
	 	numerosPrimos[5] = 11;
	 	
	 	for(int i = 0; i <= n-1 ; i++) {
	 		
	 		int a = 0;	
	 		if(n % numerosPrimos[i] != 0 ) {
	 			
	 			System.out.println("El numero " + i + " Es primo");
	 			boolean primo = true;
	 			arreglo[a] = primo;
	 			a = a + 1;
	 			
	 		}else {
	 			System.out.println("El numero " + i + " No es primo");
	 			boolean primo = false;
	 			arreglo[a] = primo;
	 			a = a + 1;
	 		}
	 
	 	}
	 	
	 	return arreglo;
	 
 }
 
 public static void main(String[] args) {
	 
	System.out.println(sieve(5));
}
}
