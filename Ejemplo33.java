import java.util.Scanner;
public class Ejemplo33 {
    public static void main(String[] args) {

        int numero, resto;
        char[] anArray = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                'H', 'L', 'C', 'K', 'E' };
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Escribe tu DNI sin la letra: ");
        numero = lector.nextInt();

        resto = numero % 23;

        System.out.println("----------------------");
        System.out.println(numero + "" + anArray[resto]);

        lector.close();
    }
}