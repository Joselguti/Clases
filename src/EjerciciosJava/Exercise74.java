package EjerciciosJava;

public class Exercise74 {
	
	public static int oddSum(int n) {
	
	int numero = 1;
	
	for(int i = 0; i<n; i++) {
		
		if(n<=0) {
			
			return 0;
		}
		
		if(n % 2 != 0)
		{
			numero = numero + n;
			n = n-1;
			
		}else {
			
			n = n-1;
		}
	}
	
	return numero;
	
}
	
public static void main(String[] args) {
	
	System.out.println(oddSum(3));
}

}
