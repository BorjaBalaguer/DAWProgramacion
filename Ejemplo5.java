import java.util.Scanner;
public class Ejemplo5 {
    public static void main (String argv[]) {
        int x, y, sum, sub, mult, div;

        System.out.println("Enter the number 1:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        System.out.println("Enter the number 2:");

        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        y = inputValue2.nextInt();

        sum = x + y;
        sub = x - y;
        mult = x * y;
        div = x / y;

        System.out.println("sum: "+sum);
        System.out.println("subtraction: "+sub);
        System.out.println("multiplication: "+mult);
        System.out.println("div: "+div);
        inputValue.close();
        inputValue2.close();
    }
}
