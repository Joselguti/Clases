package EjerciciosJava.p2b;

public class Pila {
	
    private int last_in;
	private int first_out;
    private int LIFO;
    private int idPila;
    private int Pallet;
    
    public Pila(int idPila) {
         this.last_in = 0;
         this.first_out = 0;
         this.LIFO = 0;
         this.idPila = idPila;
         this.Pallet = 0;
    }
 






	public static String pilaPush(int[] s, int x) {
		
		String disponibilidad = "";
		
		for(int i=0; i < s.length; i++) {
			
			if(s[i] == 0) {
				s[i] = x;
				disponibilidad = "El Pallet ha sido agregado al final de la pila, en la posicion " + i;
				break;
			}else {
				disponibilidad = "La pila esta llena";
			}
		}
		return disponibilidad;
    
    }
}
