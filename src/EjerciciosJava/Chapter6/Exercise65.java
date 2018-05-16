package EjerciciosJava.Chapter6;

public class Exercise65 { //Respuesta abajo !
	
	public static void main(String[] args) {
		boolean flag1 = isHoopy(202);
		boolean flag2 = isFrabjuous(202);
		System.out.println(flag1);
		System.out.println(flag2);
		if (flag1 && flag2) {
		System.out.println("ping!");
		}
		if (flag1 || flag2) {
		System.out.println("pong!");
		}
		}

		public static boolean isHoopy(int x) {
		boolean hoopyFlag;
		if (x % 2 == 0) {
		hoopyFlag = true;
		} else {
		hoopyFlag = false;
		}
		return hoopyFlag;
		}
		
		public static boolean isFrabjuous(int x) {
		boolean frabjuousFlag;
		if (x > 0) {
		frabjuousFlag = true;
		} else {
		frabjuousFlag = false;
		}
		return frabjuousFlag;
		}
}

// Dado las dos statics boolean que tienen return de frabjuousFlag y hoppyFlag pueden retornar tanto true o falso
// para esas dos boolean, en este caso se corre 202 para ambos sique el resto de 202 % 2 es 0, por lo que
// hoppyFlag es true y 202 > 0, por lo que frabjuousFlag tambien es true
// Dado esto los dos if se cumplen ya que las dos condiciones son true y entre ping con pong.