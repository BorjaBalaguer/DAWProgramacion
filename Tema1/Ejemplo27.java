import java.util.Scanner;

public class Ejemplo27 {
  public static void main(String[] args) {
    //Definicion de variables
    int numero;
    
    Scanner lector;
    lector = new Scanner(System.in);
        //Inicio de programa
        System.out.println("Escribeme un numero para ver sus numeros anteriores: ");
        numero = lector.nextInt();

        for (int i = 0; i <= numero; i++) {
          for (int j =1; j<=i; j++) {
            System.out.print(j+"");
          }
          System.out.println("");
        }
        lector.close();
  }  
}