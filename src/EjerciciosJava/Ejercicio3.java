package EjerciciosJava;

import java.util.ArrayList;

public class Ejercicio3 {
	
	
public static void main(String[] args) {
	
	int a[] = new int[] {16, 17, 18, 19, 20, 21, 22, 23, 24 ,25, 26, 27, 28, 29, 30, 31};
	
				
	for (int i = 0; i < a.length; i++) {
		
		System.out.println("American Format: \n" + args[0] + ", " + args[1] + " " + a[i] + " " + args[2]);
		System.out.println("European Format: \n" + args[0] + ", " + a[i] + " " + args[1] + " " + args[2]);
		
	}
}
}
