import java.util.Scanner;
public class Ejemplo9 {
    public static void main (String argv[]) {
        int age;
        System.out.println("Enter the age:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        age = inputValue.nextInt();

        if (age >= 18){
            System.out.println("You have the legal age.");
        }else{
            System.out.println("You are under the legal age.");
        }
        inputValue.close();
    }
}