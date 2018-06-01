package p1;

public class Fruta extends Producto{

	private String typeFruit;
	private String color;
	public Fruta(int sku, String marca, int fecha_ingr, int fecha_elab, int fecha_venc, int estado,String typeFruit, String color) {
		super(sku, marca, fecha_ingr, fecha_elab, fecha_venc, estado);
		
		this.typeFruit = typeFruit;
		this.color = color;
	}
	
	public void setTypeFruit(String typeFruit) {
		this.typeFruit = typeFruit;
	}
	public String getTypeFruit() {
		return typeFruit;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
