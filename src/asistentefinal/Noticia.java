package asistentefinal;

import java.util.concurrent.TimeUnit;

public class Noticia {
	
	private String newname; 
	private static boolean terminar; 
   
    
    public Noticia(String newname) {
         this.newname = newname;
         this.terminar = false;
    }
    
    private static final String[] NewTitle = {
            "Vuelve FF17", "Real Madrid pierde vs Colo Colo", "Juventus no se la pudo", "La U sigue sin estadio",
            "Harry Potter encontro la piedra filosofal", "Real Madrid gano Champions League", 
            "Partido se cancela porque no pagaron la luz", "Todo el curso de POO se exime en la UAI",
            "Galleta de Jengibre destruye el mundo entero", "Pelu se hace famosa"
    };
    
    public void setFunk(boolean terminar) {
    	Noticia.terminar = terminar;
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
    
    public static String getNews() {
    	double calculo = Math.random() * 10;
    	SampleFunk();
    	return "Noticia: " + NewTitle[(int) calculo];
    	
    } 
}
    
