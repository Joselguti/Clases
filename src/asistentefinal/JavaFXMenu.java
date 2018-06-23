package asistentefinal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavaFXMenu extends Application {

	public void imprimirDesocupado(ArrayList<LlamadaRecibida> a, GridPane b) {
		
		for(int i = 0; i < a.size();i++) {
	  
  			Label noticiaaa = new Label("Noticias recibidas modo ocupado" +  a.get(i).getText());
	  			b.add(noticiaaa, 1, i);
		}
  		for(int i = 0; i < a.size();i++) {
  			
			Label llamadaaa = new Label("Noticias recibidas modo ocupado" + a.get(i).getText());
	      		b.add(llamadaaa, 3, i);
	      		
	  		}
	}

   @Override
   public void start(Stage primaryStage) {
	   
	   
	   
	   boolean ocupado = false;
	   Estado state = new Estado("Modo Actual: Desocupado");
	   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		
		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
			
		
		
	   ArrayList<Tareas> tareas = new ArrayList<Tareas>();
	   ArrayList<LlamadaRecibida> llamadasrecibidas = new ArrayList<LlamadaRecibida>();
	   ArrayList<LlamadaRecibida> noticiarecibidas = new ArrayList<LlamadaRecibida>();
	   ArrayList<LlamadaRecibida> llamadasrecibidasocupado = new ArrayList<LlamadaRecibida>();
	   ArrayList<LlamadaRecibida> noticiarecibidasocupado = new ArrayList<LlamadaRecibida>();
	   
	   
	   primaryStage.setTitle("Asistente"); 
	   
	
	   
	   GridPane grid = new GridPane();
	   grid.setAlignment(Pos.CENTER);
	   grid.setHgap(10);
	   grid.setVgap(10);
	   grid.setPadding(new Insets(25, 25, 25, 25));
	   grid.getColumnConstraints().add(new ColumnConstraints(115)); 
	   grid.getColumnConstraints().add(new ColumnConstraints(100)); 
	   
	
	   
	   Label nextTask = new Label();
	   grid.add(nextTask, 0, 6);
	   Label nextTaskHour = new Label();
	   grid.add(nextTaskHour, 1, 6);
	   
	   GridPane grid4 = new GridPane();
 	   grid4.setAlignment(Pos.CENTER);
 	   grid4.setHgap(20);
 	   grid4.setVgap(10);
 	   grid4.setPadding(new Insets(25, 25, 25, 25));
 	   
 	   Scene scene4 = new Scene(grid4, 800, 800);
 	   Stage fourthStage = new Stage();
 	   fourthStage.setTitle("Noticias y Llamadas");
 	   fourthStage.setScene(scene4);
 	   fourthStage.show();
 	   
 	   GridPane grid5 = new GridPane();
 	   grid5.setAlignment(Pos.CENTER);
	   grid5.setHgap(10);
	   grid5.setVgap(10);
	   grid5.setPadding(new Insets(50, 50, 50, 50));
	   Scene scene5 = new Scene(grid5, 300, 300);
	   Stage fifthStage = new Stage();
 	   fifthStage.setTitle("Llamada Recibida");
 	   fifthStage.setScene(scene5);
 	   
	   Button btnContestar = new Button("Contestar");
 	   HBox hbBtnContestar = new HBox(10);
 	   hbBtnContestar.setAlignment(Pos.BOTTOM_RIGHT);
 	   hbBtnContestar.getChildren().add(btnContestar);
 	   grid5.add(hbBtnContestar, 3, 6);
 	 
 	   Button btnCortar = new Button("Cortar");
	   HBox hbBtnCortar = new HBox(10);
	   hbBtnCortar.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtnCortar.getChildren().add(btnCortar);
	   grid5.add(hbBtnCortar, 5, 6);
	   
	   
	   
	   btnContestar.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			Llamada.setContestar(true);
			btnContestar.setVisible(false);
		}
	   });
	   
	   btnCortar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Llamada.setContestar(false);
				Llamada.setRecibido(false);
				Stage stage1 = (Stage) btnCortar.getScene().getWindow();
				btnContestar.setVisible(true);
				Llamada.Cortar(true);
			    stage1.close();
			}
		   });
	   
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
	   Label timeLabel = new Label(LocalTime.now().format(dtf));
	   grid.add(timeLabel, 1, 1);

	  	 final Timeline timeline = new Timeline(
	  	     new KeyFrame(
	  	    		 
	  	         Duration.millis( 5000 ),
	  	         event -> {
	  	        	  timeLabel.setText( LocalTime.now().format(dtf));
	  	        	String call = Llamada.getCall();
	  	        	String news = Noticia.getNews();
	  	        	if(state.conseguirEstado() == "Modo Actual: Desocupado") {
	  	        		grid4.getChildren().clear();
	  	        		
	  	        		imprimirDesocupado(llamadasrecibidasocupado, grid4);
	  	        		imprimirDesocupado(noticiarecibidasocupado, grid4);
	  	        		
	  	        		System.out.println(Noticia.getNews());
		  	        	
		  	        	System.out.println(call);
		  	        	System.out.println(Llamada.getFunk());
		  	        	
		  	        		
		  	        	noticiarecibidas.add(new LlamadaRecibida(news));
	        			for(int i = 0; i < noticiarecibidas.size();i++) {
  	        	  			noticiarecibidas.get(i);
	        				Label noticiaa = new Label(Noticia.getNews());
  	        	  			grid4.add(noticiaa, 1, i);
	        			}
	        				
		  	        	 if(Llamada.getFunk() == true) {
		  	  
		  	        		llamadasrecibidas.add(new LlamadaRecibida(call));
		  	       	 
		  	        		fifthStage.show();
		  	        		Llamada.setRecibido(true);
		  	        			if(Llamada.getRecibido() == true) {
		  	        				
		  	        				for(int i = 0; i < llamadasrecibidas.size();i++) {
		  	        			
			  	        	  			llamadasrecibidas.get(i);
										Label llamadaa = new Label(call);
			  	        	      		grid4.add(llamadaa, 3, i);
			  	        	    		llamadasrecibidas.remove(0);
			  	        	      		
			  	        	  		}
		  	        			}
		  	        	 
	  	        	}  
	  	        	}else {
	  	        		llamadasrecibidasocupado.add(new LlamadaRecibida(call));
	  	        		noticiarecibidasocupado.add(new LlamadaRecibida(news));
	  	        		
	  	        	}
	  	        	
	  	        	}
	  	) );
	  	
	  
	  	 timeline.setCycleCount( Animation.INDEFINITE );
	  	 timeline.play();
	   
	  
 	   
 	
 	 
 	
 	 
	   Label currentDate = new Label(year + "/" + month + "/" + dayOfMonth);
	   grid.add(currentDate, 0, 1);
	   /*  
	   Label currentTime = new Label(hourOfDay + ":" + minute);
	   grid.add(currentTime, 1, 1);
	  */ 
	   Button btnAddNewTask = new Button("Agregar Tarea");
	   HBox hbBtn = new HBox(10);
	   hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn.getChildren().add(btnAddNewTask);
	   grid.add(hbBtn, 0, 2);
	   
	   Button btnCheckTask = new Button("Revisar Tareas");
	   HBox hbBtnCheck = new HBox(10);
	   hbBtnCheck.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtnCheck.getChildren().add(btnCheckTask);
	   grid.add(hbBtnCheck, 0, 3);
	   
	   Button btnChangeMode = new Button("Cambiar Estado");
	   HBox hbBtnChange = new HBox(10);
	   hbBtnChange.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtnChange.getChildren().add(btnChangeMode);
	   grid.add(hbBtnChange, 0, 4);
	   
	   final Text actiontarget = new Text();
       grid.add(actiontarget, 0, 5);
       
        	
	  
	   btnAddNewTask.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Abriendo Formulario Nueva Tarea");
		       
		 	   GridPane grid1 = new GridPane();
		 	   grid1.setAlignment(Pos.CENTER);
		 	   grid1.setHgap(20);
		 	   grid1.setVgap(10);
		 	   grid1.setPadding(new Insets(25, 25, 25, 25));
		 	   
		 	   Button btn1 = new Button("Agregar");
		 	   HBox hbBtn1 = new HBox(10);
		 	   hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
		 	   hbBtn1.getChildren().add(btn1);
		 	   grid1.add(hbBtn1, 1, 4);
		 	   
		 	   final Text actiontarget1 = new Text();
		        grid1.add(actiontarget1, 1, 6);
		       
		        
		 	   Scene scene1 = new Scene(grid1, 300, 275);
		 	   
		 	   Stage secondStage = new Stage();
	           secondStage.setTitle("Formulario Tarea");
	           secondStage.setScene(scene1);
	            
		 	   Text scenetitle1 = new Text("Nueva Tarea");
		 	   scenetitle1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		 	   grid1.add(scenetitle1, 0, 0, 2, 1);

		 	   Label taskName = new Label("Nombre Tarea: ");
		 	   grid1.add(taskName, 0, 1);

		 	   TextField taskNameTextField = new TextField();
		 	   grid1.add(taskNameTextField, 1, 1);

		 	   Label taskTime = new Label("Hora Tarea: ");
		 	   grid1.add(taskTime, 0, 2);

		 	   TextField taskHourTextField = new TextField();
		 	   grid1.add(taskHourTextField, 1, 2);
		 	   
		 	  Label taskImportance = new Label("Importancia de Tarea: ");
		 	   grid1.add(taskImportance, 0, 3);
		  
		 	  ChoiceBox<String> cb = new ChoiceBox<>();

			 	 cb.getItems().addAll("Alta", "Media", "Baja");
			 	 cb.getSelectionModel().select(0);
			 	 grid1.add(cb, 1, 3);
			 	 
		 	  secondStage.show();
		    
		 	   btn1.setOnAction(new EventHandler<ActionEvent>() {
		 		    
		 		    public void handle(ActionEvent e) {
		 		    	
		 		    	String nombre = taskNameTextField.getText();
		 		        String hora = taskHourTextField.getText();
		 		        StringBuilder horas = new StringBuilder(hora);
		 				horas.deleteCharAt(2);
		 				String resultStringHora = horas.toString();
		 				int proxHora = Integer.parseInt(resultStringHora);
		 		        String importancia = cb.getValue();
		 		       
		 				tareas.add(new Tareas(nombre, proxHora, importancia));
		 				
		 		        actiontarget.setFill(Color.FIREBRICK);
		 		        actiontarget.setText("Tarea Agregada");
		 		        Stage stage = (Stage) btn1.getScene().getWindow();
					    stage.close();
		 		    }
		 		});
		 	   
		         secondStage.show();
		    }
		});
	   
	   Text scenetitle = new Text(state.conseguirEstado());
	   scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	   grid.add(scenetitle, 0, 0, 2, 1);
	   
	   btnChangeMode.setOnAction(new EventHandler<ActionEvent>() {
		  
		
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Cambiando de Modo");
		        if(state.conseguirEstado() == "Modo Actual: Desocupado") {
		        	
		        	state.setEstado("Modo Actual: Ocupado");
		        	scenetitle.setText("Modo Actual: Ocupado");
		        
		        }else {
		        
		        	state.setEstado("Modo Actual: Desocupado");
		        	scenetitle.setText("Modo Actual: Desocupado");
		        	
		        }
		    }
		});
	   
	   btnCheckTask.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Buscando Tareas Sistema");
		        
		        	GridPane grid2 = new GridPane();
			 	   grid2.setAlignment(Pos.CENTER);
			 	   grid2.setHgap(20);
			 	   grid2.setVgap(10);
			 	   grid2.setPadding(new Insets(25, 25, 25, 25));
			 	   
			 	   Button btn2 = new Button("Confirmar");
			 	   HBox hbBtn2 = new HBox(10);
			 	   hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
			 	   hbBtn2.getChildren().add(btn2);
			 	   grid2.add(hbBtn2, 1, 6);
			 	   
			 	   final Text actiontarget1 = new Text();
			        grid2.add(actiontarget1, 1, 6);
			        
			 	   
			 	   Scene scene2 = new Scene(grid2, 400, 300);
			 	   
			 	   Stage thirdStage = new Stage();
		           thirdStage.setTitle("Tareas Dia");
		           thirdStage.setScene(scene2);
		            
			 	   Text scenetitle2 = new Text("Mostrando Tareas Actuales");
			 	   scenetitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			 	   grid2.add(scenetitle2, 0, 0, 2, 1);
			 	   
			 	  int contador = 2;
			 	 
			 	 tareas.sort(Comparator.comparing(o -> o.conseguirHoraTarea()));
			 	 
			 	  for(int i = 0 ; i < tareas.size(); i++ ) {
			
			 		String hora = (Integer.toString(tareas.get(i).conseguirHoraTarea()));
			 		String importancia = (tareas.get(i).conseguirImportancia());
			 		String nombre = (tareas.get(i).conseguirNombreTarea());
				
			 			Label nameTask = new Label(nombre);
						   grid2.add(nameTask, 1 , contador);
						   
						   Label hourTask = new Label(hora);
						   grid2.add(hourTask, 2, contador);
						   
						   Label importanceTask = new Label(importancia);
						   grid2.add(importanceTask, 3, contador);
						   contador = contador + 1;
						   
						   String hola = (hourOfDay + "" + minute);
						   System.out.println(hola);
						   int a = Integer.parseInt(hola);
			  	            
			  	     
			  	            if(a > tareas.get(i).conseguirHoraTarea()) {
			  	            	System.out.println(a);
			  	            	System.out.println("hora actual: " + tareas.get(i).conseguirHoraTarea());
			  	            	nextTask.setText(tareas.get(i).conseguirNombreTarea() + " " + tareas.get(i).conseguirHoraTarea());
			  		      	  }else {
			  		      		  nextTask.setText(tareas.get(i).conseguirNombreTarea() +" "+ tareas.get(i).conseguirHoraTarea());
			  		      	  }
			 			  
			 	  }
			 
		       	  
			 	 thirdStage.show();
			    
			   btn2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					Stage stage = (Stage) btn2.getScene().getWindow();
				    stage.close();
					
				}
				   
				  
			 		   
			 	});
			 	   
			         
		    }
		    });
	   
	   Scene scene = new Scene(grid, 300, 300);
	   primaryStage.setScene(scene);
	   
	   
	  
	   fourthStage.show();
        primaryStage.show();
   }
   
   public static void main(String[] args) {
	      launch(args);
	   }
}

