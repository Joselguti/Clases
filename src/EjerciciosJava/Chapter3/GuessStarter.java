package EjerciciosJava.Chapter3;


import java.util.Scanner;
import java.util.Random;

public class GuessStarter {
	
public static void main(String[] args) {
// pick a random number
String line;

Scanner in = new Scanner(System.in);
boolean condicion = false;

while(!condicion ) {
	
System.out.print("I'm thinking of a number between 1 and 100 \n Can you guess it? \n");

System.out.print("What is your number? \n");

line = in.nextLine();
int asd = Integer.parseInt(line);
System.out.print("Your guess is: " + line);

Random random = new Random();
int number = random.nextInt(100) + 1;
System.out.println("\nThe number I was thinking of is: " + number);
int resta = asd - number;
if(number == asd) {
	condicion = true;
}
if(resta < 0) {
	resta = -resta;
}
System.out.println("\nYou were off by: " + resta);

}
}
}

