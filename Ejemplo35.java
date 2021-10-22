import java.util.Scanner;
public class Ejemplo35 {
    public static void main(String[] args) {
        int[] anArray;
        int total;
        Scanner lector;
        lector = new Scanner(System.in);

        anArray = new int[10];

        System.out.println("Dame 10 numeros: ");
        for (int i = 0; i < anArray.length ;i++) {
            anArray[i] = lector.nextInt();
        }
        total = (anArray[0]);
        lector.close();
    }
}
