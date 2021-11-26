public class Eliminar {
    public static void main(String[] args) {
        int indice = Utilidades.leerEntero("Dame un numero para eliminar un elemento del array");
        int[] elementos = new int[6];
        Utilidades.rellenaArray(elementos, 1, 9);

        for (int i = indice + 1; i < elementos.length; i++) {
             elementos[i - 1] = elementos[i];
        }

        elementos[elementos.length - 1] = 0;

        if (indice > elementos.length) {
            do{
                indice = Utilidades.leerEntero("El valor introducido es mayor al admitido");
            }while(indice > elementos.length);   
        }

        for (int i=0; i < elementos.length; i++) {
            System.out.print(elementos[i] + ",");
        }
    }
}