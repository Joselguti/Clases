package asistentefinal;

public class Tareas {
	
	private String nombretarea; 
    private int horatarea;
    private String importanciatarea;
    private String nexttask;
    
    public Tareas(String nombretarea, int horatarea, String importanciatarea) {
         this.nombretarea = nombretarea;
         this.horatarea = horatarea;
         this.importanciatarea = importanciatarea;
         this.nexttask = "Error";
    }

    public String conseguirNombreTarea() { 
         return nombretarea;
    }
    public String getNextTask() {
    	return nexttask;
    }
    public void setNextTask(String nexttask) {
    	this.nexttask = nexttask;
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
    public String conseguirImportancia() {
	return importanciatarea;
    }
    public void fijarImportanciaTarea(String importanciatarea) {
 	this.importanciatarea = importanciatarea;
    }	
  
   

}
