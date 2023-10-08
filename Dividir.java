

public class Dividir {
    // Método estático para dividir dos números enteros (maneja la división por cero)
    public static double dividirNumeros(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // Not-a-Number para representar una división indefinida
        } else {
            return (double) numero1 / numero2;
        }
    }
}
