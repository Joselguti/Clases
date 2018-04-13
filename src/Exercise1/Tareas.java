package Exercise1;

public class Tareas {
	
	private String nombretarea;
    private int horatarea;
    private int importanciatarea;
    
    public Tareas(String nombretarea, int horatarea, int tareaporagregarimportanciaa) {
         this.nombretarea = nombretarea;
         this.horatarea = horatarea;
         this.importanciatarea = importanciatarea;
    }

    public String conseguirNombreTarea() {
         return nombretarea;
    }
    public void fijarNombreTarea(String nombretarea) {
	this.nombretarea = nombretarea;
    }
    public int conseguirHoraTarea() {
	return horatarea;
    }
    public void fijarHoraTarea(int horatarea) {
	this.horatarea = horatarea;
    }
    public int conseguirImportancia() {
	return importanciatarea;
    }
    public void fijarImportanciaTarea(int importanciatarea) {
 	this.importanciatarea = importanciatarea;
    }	

}
