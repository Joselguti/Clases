package asistente;

import java.util.ArrayList;



public class Llamada {
	
	private String contactname; 
    private int contactnumber;
   
    
    public Llamada(String contactname, int contactnumber) {
         this.contactname = contactname;
         this.contactnumber = contactnumber;
        
    }
    
    private static final String[] Nombres = {
            "Loco Byron", "Los bro", "La Sed", "PDI", "Mimami", "Michael", "Koors", "Nigg",
            "Pasapoga", "FBI", "SII", "IBM", "Google", "Kawaii", "Naik", "Real Madrid"
    };
    
    private static final String[] Numeros = {
    		"+56988457812", "+56954789214", "+56964985216", "+56967892145", "+56921365478", "+56945698752",
    		"+56945874236", "+56968721568", "+56921789543", "+56916874598", "+56965478421", "+56965478941" 
    };
    
    public static String getCall() {
    	double calculo = Math.random() * 10;
        return ("Llamada Entrante: " + Nombres[(int) calculo] + ", Numero: " + Numeros[(int) calculo]);
    } 
    
}
