package Controles.Control01;

import java.util.Scanner;

public class Control01{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numLados = 0;
        double longitudLado = 0;
        double perimetro = 0;

        System.out.println("Dime el numero de lados del poligono:");
        numLados = lector.nextInt();

        if ((numLados == 3) || (numLados == 4) )  {
            System.out.println("Dime la longitud del lado del polígono:");
            longitudLado = lector.nextInt();
            perimetro = longitudLado * numLados;
            if(numLados == 3){
                System.out.println("El perímetro del triángulo es " + perimetro);
            }else{
                System.out.println("El perímetro del cuadrado es" + perimetro);
            }
        }
        lector.close();
    }
}