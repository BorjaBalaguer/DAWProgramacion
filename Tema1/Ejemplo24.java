import java.util.Scanner;

public class Ejemplo24{
    public static void main(String[] args) {
        
        int nota, notaMedia = 0, suma = 0, contador = 0, notaDiez = 0;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Escribeme tus notas para calcular la media y para finalizar escribe el -1: ");
        nota = lector.nextInt();

        while (nota != -1) {
            contador ++;
            suma = suma + nota;
            notaMedia = suma / contador;

            if (nota == 10) {
                notaDiez ++;
            }

            nota = lector.nextInt();
        }

        if (notaDiez >= 1) {
            System.out.println("Habia al menos un 10 entre todas las notas introducidas."); 
        }else{
            System.out.println("No habia al menos un 10 entre todas las notas introducidas.");
        }

        System.out.println("La media de las notas es: " + notaMedia);

        lector.close();
    }
}