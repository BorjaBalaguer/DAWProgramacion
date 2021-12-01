public class ParesImpares{
    public static void main(String[] args) {
        int[] numeros = new int [15];
        Utilidades.rellenaArray(numeros, 1, 15);
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Pares:" + pares);
        System.out.println("Impares:" + impares);
        
    }
}