package asistente;

public class ASDtest {
	
		public boolean stance;
		
		public void addTask() {
			
			System.out.print("Introduzca el nombre de la tarea: ");
			tareaporagregarnombre = in.nextLine();
			System.out.print("Introduzca la hora de la tarea: "); 
			tareaporagregarhora = in.nextLine();
			int tareaporagregarhoraa = Integer.parseInt(tareaporagregarhora);
			System.out.print("Introduzca la importancia de la tarea: \n (1 - Alta) \n (2 - Media) \n (3 - Baja)");
			tareaporagregarimportancia = in.nextLine();
			int tareaporagregarimportanciaa = Integer.parseInt(tareaporagregarimportancia);
			tareas.add(new Tareas(tareaporagregarnombre, tareaporagregarhoraa, tareaporagregarimportanciaa));
		}
		public void busy() {
			
			while(stance == true) {	
			System.out.print("Modo ocupado");
			// Boton para salir
			}		
		}
		
		public void notBusy() {
			
			System.out.print("Modo desocupado, Alertas incoming ");
			  
			while(stance == false) {	  
				
				  
				System.out.println(Llamada.getCall());
				System.out.println(Noticia.getNews());
				
				// boton click para ir a desocupado
							
			}
		}
		
		public boolean changeStance() {
			if (stance == false) {
				stance = true;
			}else {
				stance = false;
			}
			return stance;
		}
		
		public void checkTask() {
			
			for(int i = 0 ; i < tareas.size(); i++ ) {
				
				System.out.println(tareas.get(i).getTotalInfo() + "\n");
				
			}	
		}
		
}
