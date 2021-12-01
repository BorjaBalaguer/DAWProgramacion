import java.util.Arrays;

public class Iguales {
    public static void main(String[] args) {
        int[] array1 = new int[4];
		int[] array2 = new int[4];

		Utilidades.rellenaArray(array1, 1, 2);
		Utilidades.rellenaArray(array2, 1, 2);
        boolean iguales = true;

        if (array1.length != array2.length) {
           System.out.println("No son iguales");
        }else{
                for (int j = 0; j < array2.length; j++) {
                    if (array1[j] != array2[j]) {
                        iguales = false;
                        break;
                    }else{
                        iguales = true;
                    }
                }
            }
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        if (iguales) {
            System.out.println("Los vectores son iguales.");
        }else{
            System.out.println("Los vectores son distintos.");
        }
    }
}