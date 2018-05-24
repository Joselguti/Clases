package EjerciciosJava.Chapter11;

public class Tile {

		private static String letter;
		private static int value;
		
		public Tile(String letter, int value) {
			
			this.letter = letter;
			this.value = value;
			
		}
		//Write a method named printTile that takes a Tile object as a parameter 
		//and displays the instance variables in a reader-friendly format
		
	public static String getLetter() {
		return letter;
	}
	
	public static int getValue() {
		return value;
	}
	public void setLetter(String a) {
		this.letter = a;
	}
	
	public void setValue(int b) {
		this.value = b;
	}
	
	public static String printTile(Tile c) {
		
		int a = c.getValue();
		String b = c.getLetter();

		return ("Letter: " + b + " Value: " + a);
		
	}
	//Write a method named testTile that creates a Tile object with the letter Z and the value 10,
	//and then uses printTile to display the state of the object.
	public static String testTile() {
		
		Tile test = new Tile("z",10);
		System.out.println(printTile(test));
		return "This is the test Tile";
		
	}
	  public String toString() {
	        return "Letter of the Tile: " + this.letter + " and value of the Tile " + this.value ;
	    }
	  
	  public boolean equals(Tile o) {
		    if (o == this) {
		      return true;
		    }
		    if (!(o instanceof Tile)) {
		      return false;
		    }
		    Tile cc = (Tile)o;
		    return cc.value == value;
		  }
	  
	public static void main(String[] args) {
		Tile tile = new Tile("a", 5);
		System.out.println(printTile(tile));
		System.out.println(tile.toString());
	}
}
