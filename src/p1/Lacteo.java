package p1;

public class Lacteo	extends Producto {
	
	private String nameProduct;
	private int congelado;
	
	public Lacteo(int sku, String marca, int fecha_ingr, int fecha_elab, int fecha_venc, int estado, String nameProduct) {
		super(sku, marca, fecha_ingr, fecha_elab, fecha_venc, estado);
		
		this.nameProduct = nameProduct;
		this.congelado = 0;
	}
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public void setCongelado(int congelado) {
		this.congelado = congelado;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	
	public void getCongelado() {
		if(congelado == 0) {
			System.out.println( "El producto " + nameProduct + " Requiere congelado");
		}
		else if(congelado == 1) {
			System.out.println( "El producto " + nameProduct + " Requiere congelado leve");
		}
		else if(congelado == 2) {
			System.out.println( "El producto " + nameProduct + " puede estar a temperatura ambiente");
		}else {
		System.out.println( "Informacion sobre congelado erronea, porfavor arreglar");
	}}

}
