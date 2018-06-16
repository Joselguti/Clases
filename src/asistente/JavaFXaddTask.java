package asistente;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Window;

public class JavaFXaddTask extends Application {

   @Override
   
   public void start(Stage primaryStage) {
	   primaryStage.setTitle("Asistente"); 
	   
	   
	   GridPane grid = new GridPane();
	   grid.setAlignment(Pos.CENTER);
	   grid.setHgap(20);
	   grid.setVgap(10);
	   grid.setPadding(new Insets(25, 25, 25, 25));
	   
	   Button btn = new Button("Sign in");
	   HBox hbBtn = new HBox(10);
	   hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn.getChildren().add(btn);
	   grid.add(hbBtn, 1, 4);
	   
	   final Text actiontarget = new Text();
       grid.add(actiontarget, 1, 6);
       

	   Scene scene = new Scene(grid, 300, 275);
	   primaryStage.setScene(scene);
	   
	   Text scenetitle = new Text("Nueva Tarea");
	   scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	   grid.add(scenetitle, 0, 0, 2, 1);

	   Label taskName = new Label("Nombre Tarea:");
	   grid.add(taskName, 0, 1);

	   TextField taskNameTextField = new TextField();
	   grid.add(taskNameTextField, 1, 1);

	   Label taskTime = new Label("Hora Tarea:");
	   grid.add(taskTime, 0, 2);

	   TextField taskHourTextField = new TextField();
	   grid.add(taskHourTextField, 1, 2);
	   
	  Label taskImportance = new Label("Importancia de Tarea:");
	   grid.add(taskImportance, 0, 3);
 
	   ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
			    "Alta", "Media", "Baja")
		);
	   grid.add(cb, 1, 3);
	
	   btn.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		    	String nombre = taskNameTextField.getText();
		        String hora = taskHourTextField.getText();
				int tareaporagregarhora = Integer.parseInt(hora);
		        String importancia = taskImportance.getText();
				int tareaporagregarimportancia = Integer.parseInt(importancia);
				//tareas.add(new Tareas(tareaporagregarnombre, tareaporagregarhoraa, tareaporagregarimportanciaa));
				
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Tarea Agregada");
		    }
		});
	   
        primaryStage.show();
        
   }
   
   public static void main(String[] args) {
	      launch(args);
	   }
}

