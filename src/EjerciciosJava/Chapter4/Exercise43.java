package EjerciciosJava.Chapter4;

public class Exercise43 {
	public static String printAmerican(int date,String day, String month, int year) {
		return ("American Format: " + day + ", " + month + " " + date + ", " + year);
	}
	
	public static String printEuropean(int date,String day, String month, int year) {
		return ("European Format: " + day + ", " + date + " " + month + ", " + year);
	}
	public static void main(String[] args) {
			System.out.println(printAmerican(22, "Saturday", "July", 2015));
			System.out.println(printEuropean(22, "Saturday", "July", 2015));
	}
}
