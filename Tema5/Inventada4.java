package Tema5;

// Crea un programa en el que crees un array de 1000 enteros, en las posiciones pares tienen que aparecer los multiplos de 3 empezando desde el 3,
// y en los impares los multiplos de 7 empezando por 7.
// Despues de rellenarlo teneis que imprimir el contenido del array de las posiciones que son multiplos de 13.

public class Inventada4{
    public static void main(String[] args) {
        int[] numeros = new int [1000];

        int multiplos3 = 3;
        int multiplos7 = 7;

        for (int i = 0; i < numeros.length; i+=2) {
            numeros[i] = multiplos3;
            multiplos3 +=3;
        }

        for (int i = 1; i < numeros.length; i+=2) {
            numeros[i] = multiplos7;
            multiplos7 +=7;
        }

        for (int i = 13; i < numeros.length; i+=13) {
            System.out.println(numeros[i]);
        }


    }
}