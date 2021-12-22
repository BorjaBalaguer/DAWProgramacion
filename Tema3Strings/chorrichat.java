import java.util.Scanner;

public class chorrichat {

    final static int SIN_SALUDO = 0;
    final static int SALUDO_ = 1;
    final static int BUCLE = 2;
    final static int FIN = 3;
    public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);

        int estado = SIN_SALUDO;

        while(estado != FIN) {
            System.out.println("Chorrichat -->");
           String frase = lector.nextLine().toLowerCase();
           estado = updateEstado(estado, frase);
           imprimirfrase(estado);
        }
        
        lector.close();
        
    }

    public static void imprimirfrase(int estado) {
    }

    public static int updateEstado(int estado, String frase) {
        return 0;
    }

    
}
