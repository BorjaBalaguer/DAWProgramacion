import java.util.Scanner;
public class Ejemplo4 {
    public static void main (String argv[]) {
        float side;
        float squareArea;

5        System.out.println("Enter the side:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        side = inputValue.nextFloat();

        squareArea = side * side;
        System.out.println(squareArea);
    }
}

