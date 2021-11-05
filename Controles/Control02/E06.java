import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        double catetoA = 0, catetoB = 0, hipotenusa = 0;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese cateto a: ");
        catetoA = lector.nextDouble();
        System.out.print("Ingrese cateto b: ");
        catetoB = lector.nextDouble();

        hipotenusa = (catetoA * catetoA) + (catetoB * catetoB); 

        System.out.println("La hipotenusa es " + Math.sqrt(hipotenusa));
    }
}