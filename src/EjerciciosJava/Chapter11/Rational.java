package EjerciciosJava.Chapter11;

public class Rational {
	
	private static int numerator;
	private static int denominator;
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public static int getNumerator() {
		return numerator;
	}
	
	public static int getDenominator() {
		return denominator;
	}
	public void setNumerator(int a) {
		this.numerator = a;
	}
	
	public void setDenominator(int b) {
		this.denominator = b;
	}
	//Write an instance method called printRational a displays a Rational in some reasonable format.
	
	public void printRational() {
		System.out.println("The rational is: "+numerator+ "/" + denominator);
	}
	public String toString() {
	       return "The numerator is: " + this.numerator + " and the denominator is: " + this.denominator ;
	}
	//Write an instance method called negate a reverses the sign of a rational number.
	//This method should be a modiﬁer, so it should be void. Add lines to main to test the new method.
	public void negator() {
		this.numerator *= -1;
		System.out.println("Rational has been negated!");
	}
	public void invert() {
		int a = this.numerator;
		this.numerator = this.denominator;
		this.denominator = a;
		System.out.println("Rational has been inverted!");
	}
	public static double toDouble(Rational c) {
		
		double a = c.getNumerator();
		double b = c.getDenominator();
		
		return a/b;
		
	} 
	
	  private int	gcd(int numerator,int denominator){
	      if (numerator	% denominator == 0) {
	         return denominator;
	      } 
	      else {
	         return gcd(denominator,numerator % denominator);
	      }
	   }
	   public int gcd(){
		      return gcd(this.numerator,	this.denominator);
		   }
	   
	public Rational add(Rational a){
	      int newNumerator = this.numerator * a.denominator + a.numerator * this.denominator;
	      int newDenominator = this.denominator * a.denominator;
	      Rational	result = new Rational(newNumerator,	newDenominator);
	      this.setNumerator(newNumerator);
	      this.setDenominator(newDenominator);
	      return result;
	   }
	
	public static void main(String[] args) {
	Rational a1 = new Rational();
	a1.setNumerator(5);
	a1.setDenominator(3);
	a1.printRational();
	System.out.println(a1.toString());
	a1.negator();
	a1.printRational();
	Rational a2 = new Rational(2,4);
	a2.printRational();
	a2.invert();
	a2.printRational();
	System.out.println(a2.gcd());
	}	
}
