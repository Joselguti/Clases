package Exercise1;
import java.util.Scanner;

public class Partition { 

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String n;
	    System.out.print("Introduzca un numero: ");
	    n = in.nextLine();
	    int a = Integer.parseInt(n);
	    int b = 0;

	        for (int i = 0; i <= a; i++) {
	        	int c = a-1;
	        	
	        	a = a - i;
	        	b = i -1;
	        	System.out.println(a);
	        	if(b>0) {
	        	System.out.println(b);
	        	}
	        	if (c<4) {
	            	System.out.println(a-1);
	        	}
	
	        } //maquina turing
	  
   
}
}
