package EjerciciosJava.p2b;

public class Bodega {
	private int Pila;
	private int Pallet;
	private int numeros;
	private Pila[][] pilardos;
	
	public Bodega(int numeros) {
		this.numeros = numeros;
        this.pilardos = new Pila[numeros][numeros];
	   }


	 
	 public void pushPilasBodega(int n){
		 int idPila = 0;
	
	        int a = (int) (Math.random() * 10);
	        int b = (int) (Math.random() * 10);
	        int col, row;
	        Pila pila;
	        while(n >= 1){
	            row = a;
	            col = b;
	           
	            
				pila = new Pila(idPila);
	            idPila++;
	            this.pushPila(row, col, pila);
	            n -= 1;
	        }
	    
	 }
	 
	 private void pushPila(int row, int col, Pila pila) {
	        this.pilardos[row][col] = pila;
	    }
}
