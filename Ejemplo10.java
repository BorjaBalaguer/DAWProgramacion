import java.util.Scanner;
public class Ejemplo10 {
    public static void main (String argv[]) {
        double valor;
        System.out.println("Pon un valor:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        valor = inputValue.nextDouble();

        if (valor >= 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
        inputValue.close();
    }
}