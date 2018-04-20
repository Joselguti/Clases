package EjerciciosJava;

public class Ejercicio71 {
	public static void main(String[] args) {
		
		loop(10); 
}
	
	public static void loop(int n) { 
		int i = n; 
		while (i > 1) 
		{ 
			System.out.println(i);
			
				if (i % 2 == 0) { 
					i = i / 2; 
				}else { 
					i = i + 1; 
				} 
									}
		}
									}



//1. Draw a table that shows the value of the variables i and n during the execution of loop. The table should contain one column for each variable and one line for each iteration.
	// i | n
	// 10 | 10
	// 5  | 10
 	// 6  | 10
 	// 3  | 10
	// 4  | 10
	// 2  | 10
	// 1  | 10 (Se termina while y esto no alcanza a ser mostrado)

//2. What is the output of this program?
	// el outpout de Sysout es todos los valores de i con el numero 10 usado, es decir, 10, 5, 6, 3, 4, 2, 1
//3. Can you prove that this loop terminates for any positive value of n?
	//Para todos excepto para el 1 en donde el codigo termina inmediatamente, y obviamente no se aceptaria numeros doubles, ya que estamos usando int.
