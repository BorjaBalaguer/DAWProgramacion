public class Longitud {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena:");
        String palabras[] = Utilidades.dividirEnPalabras(cadena1);
        System.out.println("----------------");
        int longitud = Utilidades.leerEntero("Dame un numero de caracteres:");
        System.out.println("----------------");
        int palabrasLongitudK=0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud ) {
                palabrasLongitudK++;
            }
        }
        System.out.println("Hay: " + palabrasLongitudK + " con la longitud de " + longitud + " caracteres.");
    }
}
