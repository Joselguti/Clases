package EjerciciosJava.Chapter10;
import java.math.BigInteger;

// Los objetos BigInteger son inmutalbes, ya que por eos debemos usar metodos como .add o .pow y otros.
// No podemos modificar sus valores "directamente" y debemos usar estos metodos.
public class Big {
	
	public static BigInteger factorial(int n){
		
		BigInteger start = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		BigInteger ONE = BigInteger.valueOf(1);
		int i = 1;
		while(i<=n){
			
			BigInteger result = start.multiply(c);
			i++;
			c.add(ONE);
			
		}
		
		return result;
	}
	
 public static void main(String[] args) {
	 
	 int x = 17;
	 BigInteger small = BigInteger.valueOf(17); 
	 BigInteger big = BigInteger.valueOf(1700000000); 
	 BigInteger total = small.add(big);
	 BigInteger totalPow = small.pow(x);
	 BigInteger totalMultiply = small.multiply(big);
	 
	// BigInteger big = BigInteger.valueOf(x);

	
	for(int i = 0; i <= 30; i++) {
		System.out.println("Number: " + i + " Factorial: " + factorial(i));
	}
}
}
