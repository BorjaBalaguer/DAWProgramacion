import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        double numero = 0, decimal = 0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = lector.nextInt();

        decimal = decimal - Math.trunc(numero);

        System.out.println(decimal);
    }
}