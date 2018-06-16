package P2a;

import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone {
	private String nombre;
	private int posicionx;
	private int posiciony;
	private int puntos;
	private String premio;
	
	public Smartphone(String nombre, int posicionx, int posiciony) {
		this.nombre = nombre;
		this.posicionx = posicionx;
		this.posiciony = posiciony;
		this.puntos = 0;
		this.premio = "Ninguno";
	}
	public String getNombre() {
		return nombre;
	}
	public int getPosicionX() {
		return posicionx;
	}
	public int getPosicionY() {
		return posiciony;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPosicionX(int x) {
		this.posicionx = x;
	}
	public void setPosicionY(int y) {
		this.posiciony = y;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	public void getTotalPos() {
		System.out.println(nombre + " se encuentra en (posx): " + posicionx + " con (posy) "+ posiciony);
	}
	public void checkPrice() {
	
		if(this.getPuntos() == 0) {
			System.out.println("Fission Mailed, Better luck next time");
		}else if(this.getPuntos() >= 0 && this.getPuntos() <= 9) {
			this.setPremio("Choripam");
			System.out.println("¡Felicidades! ganaste un: " + premio);
		}else if(this.getPuntos() >= 10 && this.getPuntos() <= 19) {
			this.setPremio("Completo");
			System.out.println("¡Felicidades! ganaste un: " + premio);
		}else if(this.getPuntos() >= 20 && this.getPuntos() <= 29) {
			this.setPremio("Aliado");
			System.out.println("¡Felicidades! ganaste un: " + premio);
		}
	}
	public Vitrina iniciar() {
		Scanner in = new Scanner(System.in);
		String respuestapregunta;
			
		
		System.out.println("Bienvenido " + this.getNombre() );
		System.out.println("Comenzando con su visita");
		
	
		
		return (new Vitrina(0, 0, 0, 0, "Inicio"));
		
	}
	public void caminar(Vitrina vitrina) {
		ArrayList<Vitrina> vitrina1 = new ArrayList<Vitrina>();
		ArrayList<Vitrina> vitrina2 = new ArrayList<Vitrina>();
		ArrayList<Animal> peces = new ArrayList<Animal>();
		ArrayList<Animal> moluscos = new ArrayList<Animal>();
		ArrayList<Animal> cetaceos = new ArrayList<Animal>();
		
		Pez salmon1 = new Pez("Garfio", "Salmon", "Super8", "8 años", "Rios", 2, 2, "Saltar");	
		Molusco molusco1 = new Molusco("Michael", "Erizo", "Plankton", "3 años", "Mar Salado", 1, "Redondo con Puas", 1);
		Cetaceo cetaceo1 = new Cetaceo("Bryan", "Ballena Azul", "Calamardo", "100 años", "Oceanos", 3, 500, "Grave");	
		AcuarioCarbono acuario1 = new AcuarioCarbono(10, 20, 50, 55,"Moluscos",40, 1);
		AcuarioOxigenado acuario2 = new AcuarioOxigenado(46,50,106,116,"Salmones", 60, 2);
		AcuarioCarbono acuario3 = new AcuarioCarbono(21, 30, 56, 60,"Cetaceos", 50, 3);
		vitrina1.add(acuario1);
		vitrina1.add(acuario3);
		vitrina2.add(acuario2);
		peces.add(salmon1);
		moluscos.add(molusco1);
		cetaceos.add(cetaceo1);
		
		int movimiento = 0;
		Scanner in = new Scanner(System.in);
		String respuestapregunta;
		String respuestapreguntaa;
		boolean confirmacion = true;
		
		while(confirmacion == true) {
		
	
		System.out.println("¿Desea terminar su visita?");
		
		respuestapregunta = in.nextLine();	
		
		if(respuestapregunta.equals("si") || respuestapregunta.equals("Si")) {
			this.checkPrice();
			confirmacion = false;
			System.out.println("Chau");
			
		} else {
			System.out.println("Donde desea desplazarse (x, y)");
			String x;
			String y;
			x = in.nextLine();	
			int x1 = Integer.parseInt(x);
			this.setPosicionX(x1);
			y = in.nextLine();
			int y1 = Integer.parseInt(y);
			this.setPosicionY(y1);
			//46,50,106,116
			if(this.getPosicionX() >= 46 && this.getPosicionX() <= 50 || this.getPosicionY() >= 106 && this.getPosicionY() <= 116) {
				System.out.println("Se a encontrado con un acuario de: Salmon, desea escuchar info? ");
				
				respuestapreguntaa = in.nextLine();	
				
				if(respuestapreguntaa.equals("si") || respuestapreguntaa.equals("Si")) {
				
				for(int i = 0 ; i < peces.size(); i++ ) {
					
					System.out.println("\n" + peces.get(i).getTotalInfo() + "\n");
				}
				}
			}if(this.getPosicionX() >= 10 && this.getPosicionX() <= 20 || this.getPosicionY() >= 50 && this.getPosicionY() <= 55) {
				System.out.println("Se a encontrado con un acuario de: Moluscos, desea escuchar info? ");
				
				respuestapreguntaa = in.nextLine();	
				
				if(respuestapreguntaa.equals("si") || respuestapreguntaa.equals("Si")) {
				
				for(int i = 0 ; i < moluscos.size(); i++ ) {
					
					System.out.println("\n" + moluscos.get(i).getTotalInfo() + "\n");
				}
				}
			}if(this.getPosicionX() >= 21 && this.getPosicionX() <= 30 || this.getPosicionY() >= 56 && this.getPosicionY() <= 60) {
				System.out.println("Se a encontrado con un acuario de: Cetaceos, desea escuchar info? ");
		
				respuestapreguntaa = in.nextLine();	
			
				if(respuestapreguntaa.equals("si") || respuestapreguntaa.equals("Si")) {
				
				for(int i = 0 ; i < cetaceos.size(); i++ ) {
					
					System.out.println("\n" + cetaceos.get(i).getTotalInfo() + "\n");
				}
				}
			}
			
			
		}
		}
	}
	}

