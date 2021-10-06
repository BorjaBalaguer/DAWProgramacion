import java.util.Scanner;
public class Ejemplo11 {

    public static void main(String[] args) {
        int valor1, valor2;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Pon el primer valor");
        valor1 = inputValue.nextInt();

        System.out.println("Pon el segundo valor");
        valor2 = inputValue.nextInt();
        
        System.out.println("-------------" );
        if (valor1 >= valor2){
            
            System.out.println(valor1 );
            System.out.println(valor2);
        }else{
            System.out.println(valor2 );
            System.out.println(valor1 );
        }
        


        inputValue.close();
    }
}