package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Unidad extends Empleado{
	
	private int unit;
	
	public Unidad(String name, String lastName, String position, int unitt) {
		super(name, lastName, position);
		
		unit = unitt;
	}
	
	public  int getUnit() {
		return unit;
	}
	
	public String toString() {
		
		if(unit == 1) {
			return "Empleado " + getName() + " es de la unidad Bodega";
		}
		else if(unit == 2) {
			return "Empleado " + getName() + " es de la unidad Reposicion";
		}
		else if (unit == 3) {
			return "Empleado " + getName() + " es de la unidad Caja";
		}
		return "Informacion erronea, porfavor arreglar";
	
	}
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public  void work() {
		if(unit == 1) {
			System.out.println("Bienvenido " + getName() + " ¿Cuantos productos desea ingresar?");
		}
		else if(unit == 2) {
			System.out.println( "Bienvenido " + getName() + " ¿Cuantos productos va a reponer? ");
		}
		else if (unit == 3) {
			System.out.println( "Bienvenido " + getName() + " Ingrese SKU producto a vender ");
			
			
		}
	}
	
	
}