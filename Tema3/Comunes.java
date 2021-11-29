import java.util.Arrays;

public class Comunes {
    public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];

		Utilidades.rellenaArray(array1, 1, 15);
		Utilidades.rellenaArray(array2, 1, 15);

	
		System.out.println("Array : " + Arrays.toString(array1));
		System.out.println("Array : " + Arrays.toString(array2));

		System.out.println("Los elementos comunes son: " + comunes(array1, array2));

	}

    public static String comunes(int[] primero, int[] segundo) {
		String comunes = "";
		// Recorremos el primero para buscar el elemento iésimo
		for (int i = 0; i < primero.length; i++) {
			// Y ahora buscamos en el segundo el elemento iésimo
			for (int j = 0; j < segundo.length; j++) {
				if (primero[i] == segundo[j]) {
					comunes += primero[i] + " ";
					break;
				}
			}
		}
		return comunes;
	}
}