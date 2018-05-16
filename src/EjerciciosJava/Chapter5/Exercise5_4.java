package EjerciciosJava.Chapter5;

import java.util.Scanner;

public class Exercise5_4 { // Exercise 5.4
	 public static int ponderacion(int a, int b, int c, int n) {
	     
		double primer = Math.pow(a, n);
		double segundo = Math.pow(b, n);
		double tercero = Math.pow(c, n);
		 
		System.out.println((primer + segundo) + " = " + tercero);
		return (int) (Math.pow(a, n) + Math.pow(b, n));
		
	    }
	
	public static void main(String[] args) {
		String respuesta1;
		String respuesta2;
		String respuesta3;
		String respuesta4;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Porfavor introduzca su numero A de a^n + b^n = c^n");
		respuesta1 = in.nextLine();	
		System.out.print("Porfavor introduzca su numero B de a^n + b^n = c^n");
		respuesta2 = in.nextLine();	
		System.out.print("Porfavor introduzca su numero C de a^n + b^n = c^n");
		respuesta3 = in.nextLine();	
		System.out.print("Porfavor ahora introduzca el exponente deseado");
		respuesta4 = in.nextLine();	
		
		int respuesta1int = Integer.parseInt(respuesta1);
		int respuesta2int = Integer.parseInt(respuesta2);
		int respuesta3int = Integer.parseInt(respuesta3);
		int respuesta4int = Integer.parseInt(respuesta4);
		
		int valor = ponderacion(respuesta1int, respuesta2int, respuesta3int, respuesta4int) ;
		
		if(respuesta4int > 2 && valor == Math.pow(respuesta3int, respuesta4int)) {
		
		System.out.println("Holy smokes, Fermat was wrong!");
		
		}else{
			System.out.println("No, that doesn’t work.");
		}
	}
}
	

