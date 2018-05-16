package EjerciciosJava.Chapter8;

public class Exercise88 {
	
	public static int maxInRange(int[] a, int lowIndex, int maxIndex ) {
		int max = 0;
		
		for(int i = lowIndex; i <= maxIndex; i++) {
			if(lowIndex == maxIndex) {
				return maxIndex;
			}else if(max <= a[i] ) {
				max = a[i];
			}
				
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] numeros = new int [10];
		numeros[0] = 4;
		numeros[1] = 2;
		numeros[2] = 7;
		numeros[3] = 10;
		numeros[4] = 15;
		numeros[5] = 3;
		
		System.out.println(maxInRange(numeros, 0, 5));
	}
}
