import java.util.Scanner;
public class Ejemplo6 {
    public static void main (String argv[]) {
        int radius;
        final double PI = 3.14159;
        double length, area;
        System.out.println("Pon el radio:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        radius = inputValue.nextInt();

        length = 2*PI*radius;
        area = PI*radius*radius;
        System.out.println("length:" +length);
        System.out.println("area:" +area);
        inputValue.close();
    }
}