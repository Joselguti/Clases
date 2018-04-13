package Exercise1;

import java.util.Scanner;



public class consejero {
	
  
		
	public static void main(String [] args) {
		String tareaporagregar;
		  boolean terminar = false;
		  boolean ocupado = false;
		
		String[] tareas = new String[10]; 
		
	
		String Si = "Si";
		String line;
		String respuestainicial;
		String respuestapregunta;
		String respuestallamada1;
		String respuestallamada2;
		String respuestallamada3;
		String respuestallamada4;
		
		Scanner in = new Scanner(System.in);
		
		while(!terminar) {	
			
		System.out.print("Seleccione una opcion: \n");
		System.out.print("(1) Agregar nueva tarea \n");
		System.out.print("(2) Iniciar Programa");
		respuestainicial = in.nextLine();	
		int asd = Integer.parseInt(respuestainicial);
		
		if(asd == 1) {
			System.out.print("Introduzca la tarea por agregar: ");
			for(int i = 0; i <= tareas.length; i++) {
			tareaporagregar = in.nextLine();
			
			if(tareas[i] == null) {
			tareas[i] = tareaporagregar;
			
			}
		}
		}else if(asd == 2){
		
	
		if(ocupado == true) {
			System.out.print("Modo Ocupado, Desea salir? ");
			 respuestapregunta = in.nextLine();	
			 
			 if(respuestapregunta == "Si") {
				 ocupado = false;
			 }
			 
		}else if (!ocupado) {
			  System.out.print("Modo desocupado, Alertas incoming ");
			  
			while(!ocupado) {	  
				  
							

							  
						if(Math.random() < 0.1 && Math.random() >= 0) {
							System.out.println("\nNoticia: Vuelve FF17");
						
						}else if (Math.random() < 0.2 && Math.random() >= 0.1){
							System.out.print("\nNoticia: Real Madrid pierde vs Colo Colo");
						
						}else if (Math.random() < 0.3 && Math.random() >= 0.2){
							System.out.print("\nNoticia: Juventus no se la pudo");
							
						}else if (Math.random() < 0.4 && Math.random() >= 0.3){
							System.out.print("\nNoticia: La nariz de pinocho exploto");
							
						} 	if(Math.random() < 0.5 && Math.random() >= 0.4) {
							System.out.println("\nLlamada: Llamada de +56988457812, Loco Byron contestar? ");
							  respuestallamada1 = in.nextLine();	
							  if(respuestallamada1 == Si) {
								
								  ocupado = true;
							  }
							  
						}else if (Math.random() < 0.6 && Math.random() >= 0.5){
							System.out.println("\nLlamada: Llamada de +56956427815, Los bro contestar? ");
							  respuestallamada2 = in.nextLine();	
							  if(respuestallamada2 == Si) {
								  ocupado = true;
							  }
						}else if (Math.random() < 0.7 && Math.random() >= 0.6){
							System.out.println("\nLlamada: Llamada de +56945781269, La Sed contestar? ");
							  respuestallamada3 = in.nextLine();	
							  if(respuestallamada3 == Si) {
								  ocupado = true;
							  }
						}else if (Math.random() < 0.8 && Math.random() >= 0.7){
							System.out.println("\nLlamada: Llamada de +56965662145, PDI contestar? ");
							  respuestallamada4 = in.nextLine();	
							  if(respuestallamada4 == Si) {
								  ocupado = true;
								
							  }
						} 
						
					//	 System.out.print("\nDesea ir a Modo Ocupado? ");
						//  line = in.nextLine();	
						  //if(line == Si) {
							//  ocupado = true;
							  
					 // }
			  }
		
		
	} 
   }
  }		  
}		}




