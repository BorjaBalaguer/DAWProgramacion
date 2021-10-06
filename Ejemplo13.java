import java.util.Scanner;
public class Ejemplo13 {

    public static void main(String[] args) {
        int valor1, valor2;
        String orden;
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Orden: Ascendente o Descendente?");
        orden = inputValue.nextLine();

        System.out.println("Pon el primer valor");
        valor1 = inputValue.nextInt();

        System.out.println("Pon el segundo valor");
        valor2 = inputValue.nextInt();

        if (orden.equals("Ascendente")){
            System.out.println("-------------");
            if(valor1 > valor2){
                System.out.println(valor1 );
                System.out.println(valor2);
            }else if (valor2 > valor1) {
                System.out.println(valor2 );
                System.out.println(valor1);
            }else{
            System.out.println("-------------");
            System.out.println(valor1 + "=" + valor2);
            }
            
        }else if (orden.equals("Descendente")){
            System.out.println("-------------");
            if(valor1 > valor2){
                System.out.println(valor2);
                System.out.println(valor1);
            }else if (valor2 > valor1){
                System.out.println(valor1);
                System.out.println(valor2);
            }else{
                System.out.println("-------------");
                System.out.println(valor1 + "=" + valor2);
            }
        }else{
            System.out.println("-------------");
            System.out.println("Elige un orden");
        }


        inputValue.close();
    }
}