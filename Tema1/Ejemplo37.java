import java.util.Scanner;

public class Ejemplo37 {
    public static void main(String[] args) {

        double[] numeros = new double[10];
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dame un numero: ");
            numeros[i] = lector.nextDouble();
            System.out.println(" ");
        }

        double maximo = numeros[0];

        for (int j = 1; j < numeros.length; j++) {
            if (numeros[j] > maximo) {
                maximo = numeros[j];
            }
        }

        double minimo = numeros[0];

        for (int k = 1; k < numeros.length; k++) {
            if (numeros[k] < minimo) {
                minimo = numeros[k];
            }
        }
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
    }
}