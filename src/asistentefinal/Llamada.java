package asistentefinal;

import java.util.ArrayList;



public class Llamada {
	
	private String contactname; 
    private int contactnumber;
    private static boolean terminar; 
    private static boolean contestar;
    private static boolean recibido;
    
    public Llamada(String contactname, int contactnumber) {
         this.contactname = contactname;
         this.contactnumber = contactnumber;
         this.terminar = true;
         this.contestar = false;
         this.recibido = false;
        
    }
    
    private static final String[] Nombres = {
            "Loco Byron", "Los bro", "La Sed", "PDI", "Mimami", "Michael", "Koors", "Nigg",
            "Pasapoga", "FBI", "SII", "IBM", "Google", "Kawaii", "Naik", "Real Madrid"
    };
    
    private static final String[] Numeros = {
    		"+56988457812", "+56964985216", "+56967892145", "+56921365478", "+56945698752",
    		"+56945874236", "+56968721568", "+56921789543", "+56916874598", "+56965478421", "+56965478941" 
    };
    
    public void setFunk(boolean terminar) {
    	this.terminar = terminar;
        }
    public static boolean getFunk() {
    	return terminar;
    }
    static void SampleFunk()
    {
      terminar = true ;
    }
    static void resetFunk() {
    	terminar = false;
    }
    public static void setContestar(boolean contestar) {
    	Llamada.contestar = contestar;
    }
    public static boolean getContestar() {
    	return contestar;
    }
    public static void setRecibido(boolean recibido) {
    	Llamada.recibido = recibido;
    }
    public static boolean getRecibido() {
    	return recibido;
    }
    public static void Cortar(boolean cortar) {
    	resetFunk();
    }
    
    public static String getCall() {
    	if(Llamada.getContestar() == false) {
    		if(Llamada.getRecibido() == false) {
    			double calculo = Math.random() * 10;
    				if(calculo > 5) {
    					
    					return ("Ninguna Llamada recibida");
    				}
    		SampleFunk();
    		return ("Llamada Entrante: " + Nombres[(int) calculo] + ", Numero: " + Numeros[(int) calculo]);
    		}else {
    			return ("Tienes una llamada esperando ser contestada");
    		}
    	}
		return 
				"Estas actualmente en una llamada";
    	} 
    
}
