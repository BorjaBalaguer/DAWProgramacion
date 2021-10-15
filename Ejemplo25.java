import java.util.Scanner;
public class Ejemplo25 {
  public static void main(String[] args) {
      int numero, factorial;
      factorial = 1;

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