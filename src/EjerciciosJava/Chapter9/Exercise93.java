package EjerciciosJava.Chapter9;

public class Exercise93 {
	public static int cuenta(String s) {
		
	
	
	
	int count = 0;
	
	for (int i = 0; i < s.length(); i++) { 
		char c = s.charAt(i); 
		if (c == '(') { 
			count++; 
		}else if (c == ')') { 
			count--; 
		} 
}
	return count;
	
	}
	
	public static void main(String[] args) {
		String s = "((3 + 7) * 2)";
		System.out.println(cuenta(s));
	}
	
}
