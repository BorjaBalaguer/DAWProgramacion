import java.util.Scanner;

public class Ejemplo21 {
     public static void main(String[] args) {
        //Declaracion de variables 
        int año ;
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        //Inicio de programa
        System.out.println("Introduce el año:");
        año = inputValue.nextInt();
        inputValue.close();

        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
	        System.out.println("El año es bisiesto");
        }else{
	        System.out.println("El año no es bisiesto");
        }
     }
}
