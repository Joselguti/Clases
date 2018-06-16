package P2a;

public class AcuarioCarbono extends Vitrina {
	
	private int nivelcarbono;
	private int id;
	
	public AcuarioCarbono(int posicioninicalx, int posicionfinalx, int posicioninicialy,
			int posicionfinaly,String tipo, int nivelcarbono, int id) {
		super(posicioninicalx, posicionfinalx, posicioninicialy, posicionfinaly, tipo);
		this.nivelcarbono = nivelcarbono;
		this.id = id;
	}
	public int getId() {
		return id;
	}

}
