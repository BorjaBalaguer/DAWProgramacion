import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
        
        String palabra;
        Scanner lector;
        boolean palindromo = false;
        lector = new Scanner(System.in);

        System.out.println("Escribeme la palabra para saber si es palindroma o no: ");
        palabra = lector.nextLine();
        lector.close();
        
        int longitud = palabra.length();
        double mitad = longitud/2;
        //System.out.println(palabra.charAt(0));

        for (int i = 0; i < mitad ;i++) {
            char caracter1 = palabra.charAt(0);
            char caracter2 = palabra.charAt(longitud)-1-i);
        }
    }
}
