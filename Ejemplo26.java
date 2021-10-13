import java.util.Scanner;
public class Ejemplo26 {
    public static void main(String[] args) {
        int numero;
  
        Scanner lector;
        lector = new Scanner(System.in);
  
        System.out.println("Dame un numero:");
        numero = lector.nextInt();
  
        while( numero != 0){
            factorial = factorial*numero;
            numero--;
        }
        System.out.println(factorial);
        lector.close();
        
    }
}
