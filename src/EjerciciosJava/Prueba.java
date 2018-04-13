package EjerciciosJava;

public class Prueba { // Exercise 5.6

    public static void baffle(String blimp) {
        System.out.println(blimp); // (paso 4 de ejecuccion)
        zippo("ping", -5); // (paso 5 de ejecuccion)
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); // (paso 6 de ejecuccion)
        } else {
            System.out.println("ik"); // (paso 2 de ejecuccion)
            baffle(quince); // (paso 3 de ejecuccion)
            System.out.println("boo-wa-ha-ha"); // (paso 7 de ejecuccion)
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13); // (paso 1 de ejecuccion)
    }

}


// 3 El valor de blimp cuando es ejecutada seria rattle 
// 4 El output del programa es (son cuatro println: ik , rattle, ping zoop, boo-wa-ha-ha)