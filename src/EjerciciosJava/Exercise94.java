package EjerciciosJava;

public class Exercise94 {
	
	/** * Returns the first character of the given String. */ 
	public static char first(String s) { 
		return s.charAt(0); 
	}
	/** * Returns all but the first letter of the given String. */ 
	public static String rest(String s) { 
		return s.substring(1); 
	}
	/** * Returns all but the first and last letter of the String. */ 
	public static String middle(String s) { 
		return s.substring(1, s.length() - 1); 
	}
	/** * Returns the length of the given String. */ 
	public static int length(String s) { 
		return s.length(); 
	}
	
	public static String printString(String c) {
		String r = "";
		
		r = r + first(c) + rest(c)  ;
		
		return r;
		
		// name1.compareTo(name2)
		// name1.equals(name2);
		//.indexOf()
		//.charAt();
		//.substring();
		
	}
	
	public static void main(String[] args) {
		
	System.out.println(first("Hola"));
	System.out.println(rest("Hola"));
	System.out.println(middle("Hola"));
	System.out.println(length("Hola"));
	
	}
}
