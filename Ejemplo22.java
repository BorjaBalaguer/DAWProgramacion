import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        
        int i, num, positivos;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        //Inicio de programa
        System.out.println("Introduce un numero:");
        num = inputValue.nextInt();

        i = 0;
        positivos = 0;
        while (i < 10) {

            num = inputValue.nextInt();

            if (num >= 0) {

                positivos = positivos + 1;

            }
        i = i + 1;
        }
        inputValue.close();
        System.out.println("-------------------");
        System.out.println("Total de numeros positivos: " + positivos);

    }
}