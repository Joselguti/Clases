package p1;

public class Producto {
	
	private int sku; 
    private String marca;
    private int fecha_ingr;
    private int fecha_elab;
    private int fecha_venc;
    private int estado;
    
    public Producto(int sku, String marca, int fecha_ingr, int fecha_elab, int fecha_venc, int estado) {
         this.sku = sku;
         this.marca = marca;
         this.fecha_ingr = fecha_ingr;
         this.fecha_elab = fecha_elab;
         this.fecha_venc = fecha_venc;
         this.estado = estado;
    }
    
    public int getSKU() { 
        return sku;
   }
    public String getMarca() { 
        return marca;
   }
    public int getFecha_Ingr() { 
        return fecha_ingr;
   }
    public int getFecha_Elab() { 
        return fecha_elab;
   }
    public int getFecha_Venc() { 
        return fecha_venc;
   }
    public String getEstado() { 
    	if(this.estado == 0) {
    		return "Estado: Recibido";
    	}
    	else if(this.estado == 1) {
    		return "Estado: Almacenado";
    	}
    	else if(this.estado == 2) {
    		return "Estado: Vendido";
    	}
    	return "Estado invalido, Producto mal ingresado";
   }
    public void setSKU(int sku) { 
        this.sku = sku;
   }
    public void setMarca(String marca) { 
        this.marca = marca;
   }
    public void setFecha_Ingr(int fecha_ingr) { 
        this.fecha_ingr = fecha_ingr;
   }
    public void setFecha_Elab(int fecha_elab) { 
        this.fecha_elab = fecha_elab;
   }
    public void setFecha_Venc(int fecha_venc) { 
        this.fecha_venc = fecha_venc;
   }
    public void setEstado(int estado) { 
        this.estado = estado;
   }
    
    public void checkRotten(int fecha_actual) {
    	int a = getFecha_Venc();
    	int b = fecha_actual - a;
    	if(b > 0 ) {
    		System.out.print("El producto esta podrido, porfavor retirar \n");
    	}
    	else {
    		System.out.print("El producto aun tiene " + -(b+500) + " dias antes de su cadusidad \n");
    	}
    
    }
}

//nombre, marca, fecha ingreso, fecha fabricación y fecha de vencimiento, estado (recibido, almacenado, etc.),
//nombre, apellido, cargo, unidad, etc