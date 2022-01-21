package Tema5;
import java.util.Scanner;
public class Capitulo3{
 
    public static void main(String[] args) {
        double NT = 0; 
        String NP ;
        double NTR = 0;
        double NF = 0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe tu nota de teoria");
        NT = lector.nextDouble();
        System.out.println("Escribe tu nota de practicas");
        NP = lector.next();
        System.out.println("Escribe tu nota de trabajos");
        NTR = lector.nextDouble();



        if (NP.equals("NoApto")) {
            NF = 4;
        }else{
            if (NT < 4.5) {
                NF=NT;
            }else{
                NF = (NT + NTR) / 2;
            }
        }

        if (NF == 10) {
            System.out.println("Nota final: Matricula de Honor");
        }else{
            System.out.println("Nota final " + NF);
        }
    }
}