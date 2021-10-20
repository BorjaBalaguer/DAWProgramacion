import java.util.*;
public class Ejemplo32 {

    public static void main(String[] args) {

        int[] anArray;
        Scanner lector;
        lector = new Scanner(System.in);

        anArray = new int[10];

        for (int i = 0; i < anArray.length ;i++) {
            System.out.println("Dame 10 numeros diferentes: ");
            anArray[i] = lector.nextInt();
        }
    }
}