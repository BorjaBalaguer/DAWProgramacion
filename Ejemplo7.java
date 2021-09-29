import java.util.Scanner;
public class Ejemplo7 {
    public static void main (String argv[]) {
        float precio, precioRebajado;
        double descuento;
        System.out.println("Introduce el precio real:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precio = inputValue.nextFloat();

        System.out.println("Introduce el precio rebajado:");

        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        precioRebajado = inputValue2.nextFloat();

        descuento =((precio - precioRebajado)/precio *100);
        System.out.println("Se le ha aplicado un descuento del: " + descuento+"%");
        inputValue.close();
        inputValue2.close();
    }
}