public class Digitos2 {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Dame la cadena:");
        System.out.println("Hay: " + numeros(cadena) + " numeros en la cadena.");
          
    }

    public static int numeros(String cadena) {
        int contador = 0;

            for (int j = 0; j < cadena.length(); j++) {
                if (Character.isDigit(cadena.charAt(j))){
                    contador++;
                    if (Character.isDigit(cadena.charAt(j -1))) {
                        contador--;
                    }
                }
        }
        return contador;
    }
}