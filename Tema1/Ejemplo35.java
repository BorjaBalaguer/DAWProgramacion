import java.util.Scanner;
public class Ejemplo35 {
    public static void main(String[] args) {
        int[] notas;
        double total = 0;
        Scanner lector;
        boolean hayDiez = false;
        lector = new Scanner(System.in);

        notas = new int[10];

        System.out.println("Dame 10 numeros: ");
        for (int i = 0; i < notas.length ;i++) {
            notas[i] = lector.nextInt();
            total += notas[i];
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 10) {
                hayDiez = true;
            }
        }
        System.out.println("--------------------------");
        if (hayDiez) {
            System.out.println("Hay almenos un diez en las notas introducidas");
        }
        System.out.println("La media es igual a: " +(total/10));
        lector.close();
    }
}