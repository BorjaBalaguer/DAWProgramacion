import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        double nota = 0, promedio = 0;
        Scanner lector = new Scanner(System.in);
       
        System.out.print("Primera nota: ");
        nota += lector.nextDouble();
        
        System.out.print("Segunda nota: ");
        nota += lector.nextDouble();

        System.out.print("Tercera nota: ");
        nota += lector.nextDouble();

        System.out.print("Cuarta nota: ");
        nota += lector.nextDouble();
        
        promedio = nota / 4;

        System.out.println("El promedio es: " + promedio);

        lector.close();
    }
}
