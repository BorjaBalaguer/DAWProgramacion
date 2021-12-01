public class MoverCeros {
    public static void main(String[] args) {
        //int[] numeros = new int [10];
        //Utilidades.rellenaArray(numeros, 1, 15);
        int[] numeros = {1,2,0,3,0,4};

        for (int i = (numeros.length -1) ; i > 0; i--) {
            if (numeros[i] == 0) {
                numeros[numeros.length] = numeros[i]; 
                numeros[i] = numeros[i+1];
            }
        }
     }
}