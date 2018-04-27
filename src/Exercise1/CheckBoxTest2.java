package Exercise1;



	
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxTest2 {

public static void main (String[] args){    
  JFrame frame = new JFrame("Test");
  frame.setVisible(true);
  frame.setSize(1000,1000);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panel = new JPanel();
  frame.add(panel);
  JButton button = new JButton("Disponible");
  panel.add(button);
  button.addActionListener (new Action1());

  JButton button2 = new JButton("Ocupado");
  panel.add(button2);
  button.addActionListener (new Action1()); 
  
  JButton button3 = new JButton("Contestar Llamada");
  panel.add(button3);
  button.addActionListener (new Action1()); 
  
  JButton button4 = new JButton("Agregar Nueva Tarea");
  panel.add(button4);
  button.addActionListener (new Action1()); 
  
}

static class Action1 implements ActionListener {        
  public void actionPerformed (ActionEvent e) {     
	  
    JFrame frame2 = new JFrame("Clicked");
    frame2.setVisible(true);
    frame2.setSize(400,400);
    
    JLabel label = new JLabel("you clicked me");
    JPanel panel = new JPanel();
    frame2.add(panel);
    panel.add(label);       
  }
}   
 
}
	