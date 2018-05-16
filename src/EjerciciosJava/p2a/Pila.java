package EjerciciosJava.p2a;

public class Pila {
	
	private int last_in;
	private int first_out;
    private int LIFO;
    private int[] arreglo = {};
    
    public Pila(int last_in, int first_out, int LIFO) {
         this.last_in = 0;
         this.first_out = 0;
         this.LIFO = 0;
    }

    public int getLastIn() {
         return last_in;
    }
    public void setLastIn(int last_in) {
	this.last_in = last_in;
    }
    public int getFirstOut() {
	return first_out;
    }
    public void setFirstOut(int first_out) {
	this.first_out = first_out;
    }
    public int getLIFO() {
	return LIFO;
    }
    public void setLIFO(int LIFO) {
 	this.LIFO = LIFO;
    }	
    
	public void pilaTop() {
		int a = 0;
		for(int i=0;i < this.arreglo.length; i++) {
			if (this.arreglo[i] != 0) {
				
				a++;
			
			}
		
		}
		System.out.println("El arreglo tiene: " + a + "numeros");
	}
	
	public void pilaPush(int x) {
		
		
		
		for(int i=0; i < this.arreglo.length; i++) {
			
			if(this.arreglo[i] == 0) {
				this.arreglo[i] = x;
				 System.out.println("El numero " + x + " ha sido agregado al final de la pila " + " En la posicion " + i);
				
				break;
			}else {
				 System.out.println("La pila esta llena");
			}
		}
	}
	
	public void pilaPop() {
		
		for(int i=0; i < this.arreglo.length; i++  ) {
			if(this.arreglo[i] == 0) {
				this.arreglo[i-1] = 0;
				break;
			}
		}
		
		System.out.println("El ultimo numero ha sido sacado");
		
	}
	
	public void pilaEmpty() {
		
		for(int i=0;i < this.arreglo.length; i++) {
			
			if(this.arreglo[i] == 0) {
				
				System.out.print("La pila esta completamente vacia");
				
			}else {
				System.out.print("La pila no esta vacia");
				break;
			}
		}
	}
	
	 public void printPila(){
	        if(this.arreglo.length == 0) {
	        	System.out.println("Error: Se encuentra vacia");
	        }
	        System.out.println("Datos dentro de la pila: ");
	        for(int i = 0; i < (this.arreglo.length) - 1; i++){
	            System.out.print(this.arreglo[i] + ", ");
	        }
	         System.out.println(this.arreglo[(this.arreglo.length) - 1]);
	    }
	
	public static void main(String[] args) {
		
	
		
		Pila pilardo = new Pila(0,0,0);
	

		
		pilardo.pilaEmpty();
		
		pilardo.pilaPush(2);
		pilardo.pilaPush(1);
		pilardo.pilaPush(5);
		pilardo.pilaPop();
		pilardo.pilaTop();
		pilardo.printPila();
	}
}
