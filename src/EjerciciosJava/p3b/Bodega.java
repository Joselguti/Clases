
package EjerciciosJava.p3b;


import java.util.Scanner;
import EjerciciosJava.p2b.Pila;


public class Bodega {
	private int Pila;
	private int Pallet;
	private int numeros;
	private Pila[][] pilardos;
	
	public Bodega(int numeros) {
		this.numeros = numeros;
        this.pilardos = new Pila[numeros][numeros];
	   }
	
	 private boolean revisarCuadrado(int row, int col){
	        if(this.pilardos[row][col] == null){
	            return false;
	        }
	        return true;
	    }
	
	 public void pushPilasBodega(int n){
		 int idPila = 0;
	
	        
	        int col, row;
	        Pila pila;
	        while(n >= 1){
	        	int a = (int) (Math.random() * 10);
		        int b = (int) (Math.random() * 10);
	            row = a;
	            col = b;
	           
	            System.out.print("Porfavor ingrese donde va a dejar su pallet (row[1-10] column[1-10]): ");
	            
	            
	        	int a = in.nextInt() - 1 ;
	            int b = in.nextInt() - 1 ;
	             
	            
				pila = new Pila(idPila);
	            idPila++;
	            this.pushPila(row, col, pila);
	            n -= 1;
	        }
	    
	 }
	 
	 private void pushPila(int row, int col, Pila pila) {
	        this.pilardos[row][col] = pila;
	    }


public void esquema(){
	System.out.println("   1   2   3   4   5   6   7   8   9   10");
    for(int i = 0; i < this.numeros; i++){
    	
        System.out.println("--------------------------------------------");
        System.out.print(i+1);
        if(i+1 < 10){
            System.out.print(" ");
        }
        System.out.print("|");
        for(int j = 0; j < this.numeros; j++){
            if(this.revisarCuadrado(i, j)){
                System.out.print("X|");
            }
            System.out.print("  | ");
        }
        System.out.println("  ");
    }

}
public static void main(String[] args) {
	
	Bodega bodega = new Bodega(10);
	bodega.pushPilasBodega(7);
	bodega.esquema();
}
}
