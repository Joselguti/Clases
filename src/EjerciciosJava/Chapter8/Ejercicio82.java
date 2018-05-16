package EjerciciosJava.Chapter8;

public class Ejercicio82 {
	
	// banana toma un arreglo de int, en donde kiwi tiene un valor de 1, mientras la variable i sea menor a el 
	// total de datos en el arreglo se va multiplicando 1 * el valor guardado de la celda actual del numero i
	// es decir, recorre nuestro arreglo completo multiplicando todos los numeros entre ellos.
	public static int banana(int[] a) { 
		int kiwi = 1; 
		int i = 0; 
		
			while (i < a.length) { 
			
				kiwi = kiwi * a[i]; 
				i++; 
			
			} 
			return kiwi; 
	}
	
	// grapefruit toma tanto un arreglo como un numero, para luego recorrer todo el arreglo y al momento de encontrar
	// un numeor igual al ingresado lo devuelve, si no existe ninguno igual, devuelve un -1
	public static int grapefruit(int[] a, int grape) { 
		for (int i = 0; i < a.length; i++) { 
			
			if (a[i] == grape) { 
				
				return i; 
				
			}
		} 
		return -1; 
	}
	
	//pineapple nuevamente toma un arreglo y una int, y define pear como 0, en donde al recorrer el arreglo a
	//si encuentra en el arreglo una variable igual entre pine y el numero ingresado se suma 1 a pera, una vez
	// terminado el for muestra el valor int total de pear sumadas.
	
	public static int pineapple(int[] a, int apple) { 
		int pear = 0; 
			for (int pine: a) { 
				if (pine == apple) { 
					pear++; 
				} 
			} 
			return pear; 
		}
}
