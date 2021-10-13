import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        
        int num, positivos;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        //Inicio de programa
        System.out.println("Introduce numeros, y el 0 para acabar");
        num = inputValue.nextInt();

        positivos = 0;
        while (num != 0) {

            if (num >= 0) {

                positivos = positivos + 1;

            }
            num = inputValue.nextInt();
        }
        inputValue.close();
        System.out.println("-------------------");
        System.out.println("Total de numeros positivos: " + positivos);

    }
}