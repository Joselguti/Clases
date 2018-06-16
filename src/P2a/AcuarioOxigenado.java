package P2a;

public class AcuarioOxigenado extends Vitrina{
	
	private int niveloxigeno;
	private int id;
	public AcuarioOxigenado(int posicioninicalx, int posicionfinalx, int posicioninicialy,
			int posicionfinaly,String tipo, int niveloxigeno, int id) {
		super(posicioninicalx, posicionfinalx, posicioninicialy, posicionfinaly, tipo);
		this.niveloxigeno = niveloxigeno;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public int getNivelOxigeno() {
		return niveloxigeno;
	}

}
