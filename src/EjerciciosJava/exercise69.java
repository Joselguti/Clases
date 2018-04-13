package EjerciciosJava;

public class exercise69 {
	
	public static int power(int x, int n) {
		
		if(n < 1) {
			return 1;
		}else {
			
			return x * power(x , n - 1  );	
		}
}
	
	
	public static void main(String[] args) {
	System.out.println(power(2 , 4));
		
	}
}
