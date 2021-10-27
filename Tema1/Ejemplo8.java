import java.util.Scanner;
public class Ejemplo8 {
    public static void main (String argv[]) {
        int age;
        System.out.println("Enter the age:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        age = inputValue.nextInt();

        if (age >= 18){
            System.out.println("You have the legal age.");
        }
        inputValue.close();
    }
}