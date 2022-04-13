package Tema6.Ficheros;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribePrimos {
    
    public static boolean esprimo(int numero) {
        boolean primo = true;
        int divisor = 2;
        
        while ((divisor < numero) && primo) {
            if ((numero % divisor) == 0) {
                primo = false;
            }
            divisor ++;
        }

        return primo;
    }

    private static void crearFichero(File f) throws IOException{
        File primos = f;
        PrintWriter pw = new PrintWriter(primos);

        if (f.exists()){
            for (int i = 2; i <= 500; i++) {
                boolean resultado = esprimo(i);
                if (resultado) {
                    pw.println(i);
                }
            }
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        File f1 = new File("Tema6/Ficheros/primos.dat");

        crearFichero(f1);
    }
}