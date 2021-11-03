import java.util.Scanner;

public class Entrada {
    
    public static int getInteger(){
        
        String mensaje = "Dame un numero";
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        boolean enteroLeido = false;

        System.out.println(mensaje);

        while (!enteroLeido) {
            if (lector.hasNextInt() && lector.hasNextInt()) {
                numero = lector.nextInt();
                
                enteroLeido = true;
            }else{
                System.out.println(mensaje);
            }
            lector.nextLine();
        }

        System.out.println("El numero es entero: " + numero);
        //lector.close();
        return numero;
    }
}