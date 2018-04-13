package Exercise1;

import java.util.*;

import com.sun.org.apache.xpath.internal.operations.Equals;



public class consejero {
	

	public static String llamadas() {
		
		String Llamadaactual = null;
		double calculo = Math.random();
		
		if(calculo < 0.5 && calculo >= 0.4) {
			
			Llamadaactual = "\nLlamada: Llamada de +56988457812, Loco Byron contestar? ";
			
		}else if (calculo < 0.6 && calculo >= 0.5){
			
			Llamadaactual = "\nLlamada: Llamada de +56956427815, Los bro contestar? ";
			
		}else if (calculo < 0.7 && calculo >= 0.6){
			
			Llamadaactual = "\nLlamada: Llamada de +56945781269, La Sed contestar? "; 
		}else if (calculo < 0.8 && calculo >= 0.7){
			
			Llamadaactual = "\nLlamada: Llamada de +56965662145, PDI contestar? "; 
			
			}
		
		return Llamadaactual;
	}
	
	
	public static String noticias() {
		String Noticiaactual = null;
		double calculo = Math.random();
		if(calculo < 0.1 && calculo >= 0) {
			
			Noticiaactual = "\nNoticia: Vuelve FF17";
		
		}else if (calculo < 0.2 && calculo >= 0.1){
		
			Noticiaactual = "\nNoticia: Real Madrid pierde vs Colo Colo";
		
		}else if (calculo < 0.3 && calculo >= 0.2){
			
			Noticiaactual = "\nNoticia: Juventus no se la pudo";
			
		}else if (calculo < 0.4 && calculo >= 0.3){
			
			Noticiaactual = "\nNoticia: La nariz de pinocho exploto";
			
		}
		return Noticiaactual; 
	}
	  
			
	public static void main(String [] args) {
			String tareaporagregarnombre;
			String tareaporagregarhora;
			String tareaporagregarimportancia;
			boolean terminar = false;
			boolean ocupado = false;
			
			ArrayList<Tareas> tareas = new ArrayList<Tareas>();
			
	
			String si = "Si";
			String line;
			String respuestainicial;
			String respuestapregunta;
			String respuestallamada1;
			String respuestallamada2;
			String respuestallamada3;
			String respuestallamada4;
			
			Scanner in = new Scanner(System.in);	
					
			while(!terminar) {	
				
				if(ocupado) {
					System.out.print("Modo Ocupado, Desea salir? ");
					respuestapregunta = in.nextLine();	
		
					if(respuestapregunta.equals(si)) {
						ocupado = false;
					} 
					
				} else {
				
					System.out.print("Seleccione una opcion: \n");
					System.out.print("(1) Agregar nueva tarea \n");
					System.out.print("(2) Iniciar Programa \n");
					System.out.print("(3) Revisar Tareas del dia");
					System.out.print("(4) Terminar Programa");
					
					respuestainicial = in.nextLine();	
					int asd = Integer.parseInt(respuestainicial);
					
					if(asd == 1) {
						System.out.print("Introduzca el nombre de la tarea: ");
						
						//for(int i = 0; i <= tareas.size(); i++) {
							tareaporagregarnombre = in.nextLine();
							System.out.print("Introduzca la hora de la tarea: "); 
							tareaporagregarhora = in.nextLine();
							int tareaporagregarhoraa = Integer.parseInt(respuestainicial);
							System.out.print("Introduzca la importancia de la tarea: \n (1 - Alta) \n (2 - Media) \n (3 - Baja)");
							tareaporagregarimportancia = in.nextLine();
							int tareaporagregarimportanciaa = Integer.parseInt(respuestainicial);
							tareas.add(new Tareas(tareaporagregarnombre, tareaporagregarhoraa, tareaporagregarimportanciaa));
						//}
						
					}else if(asd == 2){
						  System.out.print("Modo desocupado, Alertas incoming ");
						  
						while(!ocupado) {	  
							  System.out.println(ocupado);
							  
							System.out.println(llamadas());
							System.out.println(noticias());
							
							System.out.print("\nDesea ir a Modo Ocupado? ");
							respuestallamada1 = in.nextLine();
							
							  if(respuestallamada1.equals(si)) {
								  ocupado = true;
							  }	
										
										}
					}else if(asd == 3) {
						for(int i = 0 ; i == tareas.size(); i++ ) {
						System.out.println(tareas.get(i));
						}	
					}else if(asd == 4) {
						
						terminar = true;
						
					}
			     }
	  }		  
										}
						}





