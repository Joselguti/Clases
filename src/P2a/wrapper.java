package P2a;

import java.util.ArrayList;
import java.util.Scanner;


public class wrapper {
	
	public static void main(String[] args) {
		
		Smartphone user1 = new Smartphone("Juan", 0, 0);
		
		user1.getTotalPos();
		
		user1.caminar(user1.iniciar());
		
	}
}
