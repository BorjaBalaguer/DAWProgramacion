import java.util.Scanner;
public class Ejemplo11 {

    public static void main(String[] args) {
        int valor1, valor2;

        System.out.println("Pon el primer valor");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        valor1 = inputValue.nextInt();

        System.out.println("Pon el segundo valor");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        valor2 = inputValue2.nextInt();

        if (valor1 > valor2){
            System.out.println("-------------" );
            System.out.println(valor1 );
            System.out.println(valor2);
        }else if (valor2 > valor1){
            System.out.println("-------------" );
            System.out.println(valor2 );
            System.out.println(valor1 );
        }else{
            System.out.println("-------------" );
            System.out.println(valor1 + "=" + valor2);
        }


        inputValue.close();
        inputValue2.close();
    }
}