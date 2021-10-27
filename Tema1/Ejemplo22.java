import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        //Declaracion de variables
        int i, num, positivos;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        //Inicio de programa
        i = 0;
        positivos = 0;

        System.out.println("Introduce un numero:");
        while (i < 10) {
            num = inputValue.nextInt();

            if (num >= 0) {

                positivos += 1;

            }
        i += 1;
        }
        inputValue.close();
        System.out.println("-------------------");
        System.out.println("Total de numeros positivos: " + positivos);

    }
}