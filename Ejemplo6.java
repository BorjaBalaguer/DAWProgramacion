import java.util.Scanner;
public class Ejemplo6 {
    public static void main (String argv[]) {
        float radius;
        float length;
        float area;
        final double PI = 3.14159;
        System.out.println("Enter the radius:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        radius = inputValue.nextFloat();

        length = 2 * PI * radius;
        area = PI * radius * radius
        System.out.println("length:" +length);
        System.out.println("area:" +area);
    }
}