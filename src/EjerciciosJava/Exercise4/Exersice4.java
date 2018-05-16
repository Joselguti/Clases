package EjerciciosJava.Exercise4;

public class Exersice4 {
	public static int mystery(int a, int b) {
		if (b== 0) return 1; 
		if (b % 2 == 0) return mystery(a+a, b/2); //dado valores de a y b lo que hace es que calcula el resto de la div
		return mystery(a+a, b/2) + a; // si este es 0 entonces corre lo mismo pero con a sumado y b divido
	}								// en el caso de que b fuera 0 este retorna 1	
	public static void main(String[] args) {
		System.out.println(mystery(2 , 25)); // 50
		System.out.println(mystery(3 , 11)); // 33
	}
}
