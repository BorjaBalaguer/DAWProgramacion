public class Eliminar {
    public static void main(String[] args) {
        int indice = Utilidades.leerEntero("Dame un numero para eliminar un elemento del array");
        int[] elementos = new int[6];
        Utilidades.rellenaArray(elementos, 1, 9);

        do{
            indice = Utilidades.leerEntero("El valor introducido es mayor al admitido (del 0 al 5)");
        }while((indice > (elementos.length - 1) || (indice < 0)));
        
        for (int i = indice + 1; i < elementos.length; i++) {
             elementos[i - 1] = elementos[i];
        }

        elementos[elementos.length - 1] = 0;   

        for (int i=0; i < elementos.length; i++) {
            System.out.print(elementos[i] + ",");
        }
    }
}