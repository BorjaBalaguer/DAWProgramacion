import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {

        int numero, positivos;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        // Inicio de programa
        System.out.println("Introduce numeros, y pulse el 0 para acabar");
        
        positivos = 0;
        do {
            numero = inputValue.nextInt();
            if (numero > 0) {
                positivos++;
            }
            
        }while (numero != 0); 
        
        inputValue.close();
        System.out.println("-------------------");
        System.out.println("Total de numeros positivos: " + positivos);

    }
}