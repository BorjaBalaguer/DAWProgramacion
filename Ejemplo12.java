import java.util.Scanner;
public class Ejemplo12 {

    public static void main(String[] args) {
        int valor1, valor2;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Pon el primer valor");
        valor1 = inputValue.nextInt();

        System.out.println("Pon el segundo valor");
        valor2 = inputValue.nextInt();

        if (valor1 > valor2){
            System.out.println("-------------" );
            System.out.println(valor1 + ">" + valor2);
        }else if (valor2 > valor1){
            System.out.println("-------------" );
            System.out.println(valor2 + ">" + valor1);
        }else{
            System.out.println("-------------" );
            System.out.println(valor1 + "=" + valor2);
        }


        inputValue.close();
    }
}