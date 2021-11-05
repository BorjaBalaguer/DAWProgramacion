import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        int numero = 0, invertido = 0, resto = 0;
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        numero = lector.nextInt();

        while( numero > 0 ) {
            //Lo que hace esta formula es ir sacando numeros de derecha y los va poniendo a la izquierda, hasta que se queda sin valores
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        System.out.println(invertido );
        lector.close(); 
    }
}