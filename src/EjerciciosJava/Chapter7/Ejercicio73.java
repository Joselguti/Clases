package EjerciciosJava.Chapter7;

public class Ejercicio73 {
	
	public static int power(int a, int b) {
		
	   int numero = 1;
	    
	    for(int i = 0; i < b; i++)  {  
	    	
	        numero = (a * numero);
	        
	        if(b == 0) {
	        	return 1;
	        }
	    }
	    return numero; 
	}
	
	public static void main(String[] args) {
		
		System.out.println(power(2, 0));
		
	}
}
