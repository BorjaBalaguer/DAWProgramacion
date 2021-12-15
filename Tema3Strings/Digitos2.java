public class Digitos2 {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Dame la cadena:");
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        System.out.println("Hay: " + numeros(cadena, palabras) + " numeros en la cadena.");
          
    }

    public static int numeros(String cadena , String[] palabras) {
        int contador = 0;
        int digitosnumeros = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                digitosnumeros = 0;
                if (Character.isDigit(palabras[i].charAt(j))){
                    digitosnumeros++;
                }else{
                    break;
                }
                if (digitosnumeros == palabras[i].length()) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
