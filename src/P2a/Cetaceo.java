package P2a;

public class Cetaceo extends Animal{
	
	private int peso;
	private String sonido;
	
	public Cetaceo(String name, String especie, String alimentacion, String crecimiento, String habitat,int idacuario, int peso, String sonido) {
		super(name, especie, alimentacion, crecimiento, habitat, idacuario);
		this.peso = peso;
		this.sonido = sonido;
	}
	public int getPeso() {
		return peso;
	}
	public String getSonido() {
		return sonido;
	}
	public void setPeso(String Peso) {
		this.peso = peso;
	}
	public void setSonido(int Sonido) {
		this.sonido = sonido;
	}
}
