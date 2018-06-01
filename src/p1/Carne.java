package p1;

public class Carne extends Producto{
	
	private String corte;
	private int congelado;
	
	public Carne(int sku, String marca, int fecha_ingr, int fecha_elab, int fecha_venc, int estado, String corte) {
		super(sku, marca, fecha_ingr, fecha_elab, fecha_venc, estado);
		
		this.corte = corte;
		this.congelado = 0;
		
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public void setCongelado(int congelado) {
		this.congelado = congelado;
	}
	public String getCorte() {
		return corte;
	}
	public void getCongelado() {
		if(congelado == 0) {
			System.out.println(" La carne de " + corte + " requiere congelado");
		}
		else if(congelado == 1) {
			System.out.println("La carne de " + corte + " no requiere congelado");
		}
		else {
		System.out.println("Informacion erronea, porfavor arreglar");
		}
	}
	

}
