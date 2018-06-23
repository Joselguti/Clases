package asistentefinal;

public class Estado {
	
	private String estado; 
	
    public Estado(String estado) {
         this.estado = estado;
    }
    
    public String conseguirEstado() { 
         return estado;
    }
    public void setEstado(String estado) {
    	this.estado = estado;
    }
    
}
