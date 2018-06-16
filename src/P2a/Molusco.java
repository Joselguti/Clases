package P2a;

public class Molusco extends Animal {
	
	private String caparazon;
	private int venenoso;
	
	public Molusco(String name, String especie, String alimentacion, String crecimiento, String habitat, int idacuario, String caparazon, int venenoso) {
		super(name, especie, alimentacion, crecimiento, habitat, idacuario);
		this.caparazon = caparazon;
		this.venenoso = venenoso;
	}
	public  String getCaparazon() {
		return caparazon;
	}
	public String getVenenoso() {
		if(venenoso == 1) {
			return "Es Venenoso";
		}else if(venenoso == 0) {
			return "No es Venenoso";
		}else {
			return "Informacion Incorrecta, Corregir";
		}
	}
	public void setCaparazon(String caparazon) {
		this.caparazon = caparazon;
	}
	public void setVenenoso(int venenoso) {
		this.venenoso = venenoso;
	}
}
