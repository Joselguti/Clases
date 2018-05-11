package asistente;

public class Noticia {
	
	private String newname; 
   
   
    
    public Noticia(String newname) {
         this.newname = newname;
        
    }
    
    private static final String[] NewTitle = {
            "Vuelve FF17", "Real Madrid pierde vs Colo Colo", "Juventus no se la pudo", "La U sigue sin estadio",
            "Harry Potter encontro la piedra filosofal", "Real Madrid gano Champions League", 
            "Partido se cancela porque no pagaron la luz", "Todo el curso de POO se exime en la UAI",
            "Galleta de Jengibre destruye el mundo entero", "Pelu se hace famosa"
    };
    
    public static String getNews() {
    	double calculo = Math.random() * 10;
        return ("Noticia: " + NewTitle[(int) calculo]);
        
    } 
}
    
