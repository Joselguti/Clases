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
import javafx.scene.layout.ColumnConstraints;
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

public class JavaFXMenu extends Application {

   @Override
   public void start(Stage primaryStage) {
	   primaryStage.setTitle("Asistente"); 
	   
	   
	   GridPane grid = new GridPane();
	   grid.setAlignment(Pos.CENTER);
	   grid.setHgap(10);
	   grid.setVgap(10);
	   grid.setPadding(new Insets(25, 25, 25, 25));
	   grid.getColumnConstraints().add(new ColumnConstraints(115)); // column 0 is 100 wide
	   grid.getColumnConstraints().add(new ColumnConstraints(100)); // column 1 is 200 wid
	   
	   Button btnAddNewTask = new Button("Agregar Tarea");
	   HBox hbBtn = new HBox(10);
	   hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn.getChildren().add(btnAddNewTask);
	   grid.add(hbBtn, 0, 1);
	   
	   Button btnCheckTask = new Button("Revisar Tareas");
	   HBox hbBtnCheck = new HBox(10);
	   hbBtnCheck.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtnCheck.getChildren().add(btnCheckTask);
	   grid.add(hbBtnCheck, 0, 2);
	   
	   Button btnChangeMode = new Button("Modo Ocupado");
	   HBox hbBtnChange = new HBox(10);
	   hbBtnChange.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtnChange.getChildren().add(btnChangeMode);
	   grid.add(hbBtnChange, 0, 3);
	   
	   final Text actiontarget = new Text();
       grid.add(actiontarget, 0, 5);
       
	   btnAddNewTask.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Tarea Agregada");
		    }
		});
	   
	   btnAddNewTask.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Abriendo Formulario Nueva Tarea");
		    }
		});
	   btnChangeMode.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Cambiando de Modo");
		    }
		});
	   
	   btnCheckTask.setOnAction(new EventHandler<ActionEvent>() {
		    
		    public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Buscando Tareas Sistema");
		    }
		});
	   Scene scene = new Scene(grid, 300, 300);
	   primaryStage.setScene(scene);
	   
	   Text scenetitle = new Text("Modo Actual: Desocupado");
	   scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	   grid.add(scenetitle, 0, 0, 2, 1);

	
 
	   
        primaryStage.show();
   }
   
   public static void main(String[] args) {
	      launch(args);
	   }
}

