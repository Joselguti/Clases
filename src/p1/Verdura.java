package p1;

public class Verdura extends Producto {
	
	private String tipoVerdura;
	private int refrigeracion;
	
	public Verdura(int sku, String marca, int fecha_ingr, int fecha_elab, int fecha_venc, int estado, String tipoVerdura) {
		super(sku, marca, fecha_ingr, fecha_elab, fecha_venc, estado);
		this.tipoVerdura = tipoVerdura;
		this.refrigeracion = 0;
	}
	
	public void setTipoVerdura(String tipoVerdura) {
		this.tipoVerdura = tipoVerdura;
	}
	public void setRefrigeracion(int refrigeracion) {
		this.refrigeracion = refrigeracion;
	}
	public String getTipoVerdura() {
		return tipoVerdura;
	}
	
	public void getRefrigeracion() {
		if(refrigeracion == 0) {
			System.out.println( "El producto " + tipoVerdura + " requiere refrigeracion entre -10°C y 0°C");
		}
		else if(refrigeracion == 1) {
			System.out.println( "El producto " + tipoVerdura + " requiere refrigeracion entre 0°C y 10°C");
		}
		else if(refrigeracion == 2) {
			System.out.println( "El producto " + tipoVerdura + " requiere refrigeracion entre 10°C y 20°C");
		}
		else if(refrigeracion == 3) {
			System.out.println( "El producto " + tipoVerdura + " puede estar a temperatura ambiente");
		}else {
		System.out.println( "Informacion sobre refrigeracion erronea, Porfavor corregir");
	}
	}
}
