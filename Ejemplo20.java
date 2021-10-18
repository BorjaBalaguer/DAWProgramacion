import java.util.Scanner;
public class Ejemplo20 {
    public static void main (String argv[]) {
        //Declaracion de variables
        double precio, precioFinal;

        Scanner lector;
        lector = new Scanner(System.in);
        
        //Inicio de programa
        System.out.println("Introduce el precio:");
        precio = lector.nextDouble();
        lector.close();

        if (precio < 6) {
            precioFinal = precio;
        }else if(precio >= 6 && precio < 60){
            precioFinal = precio / 1.05;
        }else{
            precioFinal = precio / 1.1;
        }
        
        System.out.println(precioFinal);
    }
}