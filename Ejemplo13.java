import java.util.Scanner;
public class Ejemplo13 {

    public static void main(String[] args) {
        int valor1, valor2;
        String orden;

        System.out.println("Pon el primer valor");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        valor1 = inputValue.nextInt();

        System.out.println("Pon el segundo valor");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        valor2 = inputValue2.nextInt();

        System.out.println("Orden: Ascendente o Descendente?");
        Scanner inputValue3;
        inputValue3 = new Scanner(System.in);
        orden = inputValue3.nextLine();

        if (orden = Ascendente){
            System.out.println("-------------" );
            if(valor1 > valor2){
                System.out.println(valor1 );
                System.out.println(valor2);
            }else if (valor2 > valor1) {
                System.out.println(valor2 );
                System.out.println(valor1);
            }else{
            System.out.println("-------------" );
            System.out.println(valor1 + "=" + valor2);
            
        }
            
        }else if (orden = "Descendente"){
            System.out.println("-------------" );
            if(valor1 > valor2){
                System.out.println(valor2 );
                System.out.println(valor1);
            }else if (valor2 > valor1){
                System.out.println(valor1 );
                System.out.println(valor2);
            }else{
                System.out.println("-------------" );
                System.out.println(valor1 + "=" + valor2);
            }
        }else{
            System.out.println("-------------" );
            System.out.println("Elige un orden");
        }


        inputValue.close();
        inputValue2.close();
        inputValue3.close();
    }
}