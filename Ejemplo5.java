import java.util.Scanner;
public class Ejemplo5 {
    public static void main (String argv[]) {
        float x;
        float y;
        float sum;
        float sub;
        float mult;
        float div;

        System.out.println(“Enter the number1: ”);

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        System.out.println(“Enter the number2: ”);

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        y = inputValue.nextFloat();

        sum = x + y;
        sub = x - y;
        mult = x * y;
        div = x / y;
        System.out.println("sum:"+sum);
        System.out.println("substraction:"+sub);
        System.out.println("multiplication:"+mult);
        System.out.println("division:"+div);
    }
}
