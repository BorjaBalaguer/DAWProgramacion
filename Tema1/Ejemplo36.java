import java.util.Scanner;

public class Ejemplo36 {
    public static void main(String[] args) {
        
        double[] numeros = new double[10];
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dame un numero: ");
            numeros[i] = lector.nextDouble();
            System.out.println(" ");
        }



        double maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El numero maximo es: " + maximo);
    }
}
