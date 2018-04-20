package EjerciciosJava;

public class Ejercicio67 {
	
	public static int oddSum(int n) {
		
		
		if(n<=0) {
			return 0;
		}
		
		if(n % 2 != 0)
		{
			return (n+oddSum(n-1));
			
		}else {
			return oddSum(n-1);
		}
		
	
}
	
public static void main(String[] args) {
	
	System.out.println(oddSum(3));
}
}
