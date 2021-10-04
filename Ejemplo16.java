import java.util.Scanner;
public class Ejemplo16 {
    
    public static void main(String[]args){
       
        int num1, num2;
        String op;
        
        System.out.println("Enter the number 1:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();

        System.out.println("Enter the number 2:");

        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        num2 = inputValue2.nextInt();

        System.out.println("Que operacion quieres hacer?(+,-,*,/)");

        Scanner miScanner = new Scanner(System.in);
        op = miScanner.next();

        inputValue.close();
        inputValue2.close();
        miScanner.close();

        switch (op) {
            case "*":
                System.out.println("El resultado es: " + (num1*num2));
                break;

            case "/":
                System.out.println("El resultado es: " + (num1/num2));
                break;

            case "+":
                System.out.println("El resultado es: " + (num1+num2));
                break;
            
            case "-":
                System.out.println("El resultado es: " + (num1-num2));
                break;

            default:
                break;
        }
    }
}
