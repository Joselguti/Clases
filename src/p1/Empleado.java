package p1;

public class Empleado {
	
	private  String name;
	private  String lastName;
	private  String position;
	
	public Empleado(String name, String lastName, String position) {	
		this.name = name;
		this.lastName = lastName;
		this.position = position;
	}
	
	public  String getName() {
		return name;
	}
	public  String getLastName() {
		return lastName;
	}
	public  String getPosition() {
		return position;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getTotalInfo() {
	    return ("Nombre: " + this.name + " Apellido: " + this.lastName + "Posicion: " + this.position);
	} 
	
}
//nombre, apellido, cargo, unidad, etc.
