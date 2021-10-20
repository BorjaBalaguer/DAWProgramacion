import java.util.*;
public class Ejemplo32 {

    public static void main(String[] args) {

        int[] anArray;
        Scanner lector;
        lector = new Scanner(System.in);

        anArray = new int[10];

        System.out.println("Dame 10 numeros: ");
        for (int i = 0; i < anArray.length ;i++) {
            anArray[i] = lector.nextInt();
        }
        System.out.println("----------------------");
        for (int j = 9; j >=0 ;j--) {
            
            System.out.println(anArray[j]);
        }
        lector.close();
    }
}