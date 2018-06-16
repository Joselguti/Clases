package P2c;

public class Pez extends Animal{
	
	private int aletas;
	private String capacidades;
	
	public Pez(String name, String especie, String alimentacion, String crecimiento, String habitat, int idacuario, int aletas, String capacidades) {
		super(name, especie, alimentacion, crecimiento, habitat, idacuario);
		this.aletas = aletas;
		this.capacidades = capacidades;
	}

	
	
	public int getAletas() {
		return aletas;
	}
	public String getCapacidades() {
		return capacidades;
	}
	public void setAletas(int aletas) {
		this.aletas = aletas;
	}
	public void setCapacidades(String capacidades) {
		this.capacidades = capacidades;
	}
}
