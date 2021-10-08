import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        
        int num, positivos;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        //Inicio de programa
        System.out.println("Introduce un numero:");
        num = inputValue.nextInt();

        positivos = 0;
        while (num != 0) {

            num = inputValue.nextInt();

            if (num >= 0) {

                positivos = positivos + 1;

            }
        }
        inputValue.close();
        System.out.println("-------------------");
        System.out.println("Total de numeros positivos: " + positivos);

    }
}