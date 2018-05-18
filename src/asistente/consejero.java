package asistente;

import java.util.*;

import com.sun.org.apache.xpath.internal.operations.Equals;



public class consejero {
	

	public static void main(String [] args) {
			String tareaporagregarnombre;
			String tareaporagregarhora;
			String tareaporagregarimportancia;
			boolean terminar = false;
			boolean ocupado = false;
			
			ArrayList<Tareas> tareas = new ArrayList<Tareas>();
			Tareas T1;
	
			String si = "Si";
			String line;
			String respuestainicial;
			String respuestapregunta;
			String respuestallamada1;
			String respuestallamada2;
			String respuestallamada3;
			String respuestallamada4;
			String confirmationresponse;
			
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
					System.out.print("(3) Revisar Tareas del dia \n" );
					System.out.print("(4) Terminar Programa \n");
					
					
					respuestainicial = in.nextLine();	
					int asd = Integer.parseInt(respuestainicial);
					boolean confirmation = false;
					if(asd == 1) {
					
						
						while(!confirmation) {
							System.out.print("Introduzca el nombre de la tarea: ");
							tareaporagregarnombre = in.nextLine();
							System.out.print("Introduzca la hora de la tarea: "); 
							tareaporagregarhora = in.nextLine();
							int tareaporagregarhoraa = Integer.parseInt(tareaporagregarhora);
							System.out.print("Introduzca la importancia de la tarea: \n (1 - Alta) \n (2 - Media) \n (3 - Baja)");
							tareaporagregarimportancia = in.nextLine();
							int tareaporagregarimportanciaa = Integer.parseInt(tareaporagregarimportancia);
							tareas.add(new Tareas(tareaporagregarnombre, tareaporagregarhoraa, tareaporagregarimportanciaa));
							
							System.out.print("Desea agregar otra tarea?");
							confirmationresponse = in.nextLine();
							
							if(confirmationresponse.equals("No")) {
								confirmation = true;
							}
						}
						
					}else if(asd == 2){
						System.out.print("Modo desocupado, Alertas incoming ");
						  
						while(!ocupado) {	  
							
							  
							System.out.println(Llamada.getCall());
							System.out.println(Noticia.getNews());
							
							System.out.print("\nDesea ir a Modo Ocupado? ");
							respuestallamada1 = in.nextLine();
							
							  if(respuestallamada1.equals(si)) {
								  ocupado = true;
							  }	
										
										}
					}else if(asd == 3) {
						
						for(int i = 0 ; i < tareas.size(); i++ ) {
						
							System.out.println(tareas.get(i).getTotalInfo() + "\n");
							
						}	
					}else if(asd == 4) {
						System.out.println("Hasta Luego");
						terminar = true;
						
					}
			     }
	  }		  
										}
						}





