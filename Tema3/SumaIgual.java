import java.util.Arrays;
import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {
        int [] vector = new int[10];
        int numero = Utilidades.leerEntero("Dame un numero para comprobar");

        Utilidades.rellenaArray(vector, 1, 15);

        System.out.println("Array : " + Arrays.toString(vector));

        for (int i = 0; i < vector.length; i++) {
            for (int j = i +1; j < vector.length; j++) {
                if (vector[i] + vector[j] == numero) {
                    System.out.println(vector[i] + " + " + vector[j] + " = " + numero);
                }
            }
        }
    }
}
