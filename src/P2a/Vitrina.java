package P2a;

public class Vitrina {
	
	
	private int posicioninicialx;
	private int posicionfinalx;
	private int posicioninicialy;
	private int posicionfinaly;
	private String tipo;
	
	public Vitrina(int posicioninicialx, int posicionfinalx, int posicioninicialy, int posicionfinaly, String tipo) {	
		this.posicioninicialx = posicioninicialx;
		this.posicionfinalx = posicionfinalx;
		this.posicioninicialy = posicioninicialy;
		this.posicioninicialy = posicioninicialy;
		this.tipo = tipo;
		
	}
	public int getXi() {
		return posicioninicialx;
	}
	public int getXf() {
		return posicionfinalx;
	}
	public int getYi() {
		return posicioninicialy;
	}
	public int getYf() {
		return posicionfinaly;
	}
	public String getTipo() {
		return tipo;
	}
	
}
