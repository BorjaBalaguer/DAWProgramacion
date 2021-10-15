import java.util.Scanner;
public class Ejemplo28 {
    public static void main(String[] args) {
        //Inicializacion de variables
        int numero, divisor = 2;
        boolean esPrimo = true;

        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Escribeme el numero para saber si es primo o no: ");
        numero = lector.nextInt();
        //Inicio programa
        while ((divisor < numero) && esPrimo) {
            if ((numero % divisor) == 0) {
                esPrimo = false;
            }
            divisor ++;
        }
        if (esPrimo) {
            System.out.println("El numero " + numero + " es primo");
        }else{
            System.out.println("El numero " + numero + " no es primo");
        }
        lector.close();
    }
}