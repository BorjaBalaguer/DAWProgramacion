import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        int longitud = 0; 
        double pulgadas = 0;
        Scanner lector = new Scanner(System.in);
       
        System.out.print("Ingrese longitud: ");
        longitud = lector.nextInt();

        pulgadas = longitud * 0.39370;
        System.out.println(longitud + " cm = " + pulgadas + " in");
        lector.close();
    }
}