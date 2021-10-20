import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
        
        String palabra;
        Scanner lector;
        boolean esPalindromo = true;
        lector = new Scanner(System.in);

        System.out.println("Escribeme la palabra para saber si es palindroma o no: ");
        palabra = lector.nextLine();
        lector.close();
        
        int longitud = palabra.length();
        double mitad = longitud/2;

        for (int i = 1; i < mitad ;i++) {
            char caracter1 = palabra.charAt(i -1);
            char caracter2 = palabra.charAt(longitud -i);
            if(caracter1 != caracter2) {
                esPalindromo = false;
            }
        }
        if (esPalindromo) {
            System.out.println("La palabra " + palabra + " es palindroma");
        }else{
            System.out.println("La palabra " + palabra + " no es palindroma");
        }
    }
}