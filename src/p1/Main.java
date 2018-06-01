package p1;

import java.util.ArrayList;

// OUTPUT
// La carne de Buey requiere congelado
//El producto aun tiene 100 dias antes de su cadusidad 
//El producto Leche Entera Chocolate Requiere congelado
//Yogurt Vainilla
//Estado: Vendido
//President
//Lechuga Romana
//El producto esta podrido, porfavor retirar 
//Tomate Frito
//Verde

// Trabajadores de unidad caja
//Nombre:  Pedro  Apellido:  Picapiedra Posicion:  Supervisor 

//Trabajadores de unidad bodega
//Nombre: Pablo  Apellido:  Escobar Posicion:  Jefazo 

//Trabajadores de unidad reposicion
//Nombre:  Juan  Apellido:  JuanJarry Posicion:  Junior 


public class Main {
	
	public static void showWorkersUnit(ArrayList a) {
		for(int i = 0 ; i < a.size(); i++ ) {
			
			System.out.println(((Unidad) a.get(i)).getTotalInfo() + "\n");
			
		}	
	}
	
public static void main(String[] args) {
	
Carne filete = new Carne(0, "Argentinache", 52518, 52018, 53018, 0, "Buey");
Carne lomo = new Carne(1, "Perupe", 52818, 52018, 52518, 2, "Vaca Liso");
Lacteo leche_entera = new Lacteo(2, "Colum", 52318, 51518, 52018, 3, "Leche Entera Chocolate");
Lacteo yogurt = new Lacteo(3, "Sopraval", 53018, 52018, 60118, 2, "Yogurt Vainilla");
Lacteo queso = new Lacteo(4, "President", 52618, 51818, 52418, 1, "Queso Azul");
Verdura lechuga = new Verdura(5, "La Florencia", 42018, 41518, 51518, 2, "Lechuga Romana");
Fruta tomates = new Fruta(6, "Gallina Blanca", 52518, 51618, 53018, 1 , "Tomate Frito", "Verde");

ArrayList<Unidad> bodega = new ArrayList<Unidad>();
ArrayList<Unidad> reposicion = new ArrayList<Unidad>();
ArrayList<Unidad> caja = new ArrayList<Unidad>();


bodega.add(new Unidad("Pablo ", " Escobar ", " Jefazo ", 1));
reposicion.add(new Unidad(" Juan ", " JuanJarry ", " Junior ", 2));
caja.add(new Unidad(" Pedro ", " Picapiedra ", " Supervisor ", 3));

filete.getCongelado();
lomo.checkRotten(51918);
leche_entera.getCongelado();
System.out.println(yogurt.getNameProduct());
System.out.println(yogurt.getEstado());
System.out.println(queso.getMarca());
System.out.println(lechuga.getTipoVerdura());
lechuga.checkRotten(52018);
System.out.println(tomates.getTypeFruit());
System.out.println(tomates.getColor());

System.out.println("\n Trabajadores de unidad caja");
showWorkersUnit(caja);
System.out.println("Trabajadores de unidad bodega");
showWorkersUnit(bodega);
System.out.println("Trabajadores de unidad reposicion");
showWorkersUnit(reposicion);


	
}

}
