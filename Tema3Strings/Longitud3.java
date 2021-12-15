public class Longitud3 {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena:");
        String palabras[] = Utilidades.dividirEnPalabras(cadena1);
        System.out.println("----------------");
        int longitud = Utilidades.leerEntero("Dame un numero de caracteres:");
        System.out.println("----------------");
        boolean palabrasLongitudK= false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= longitud ) {
                palabrasLongitudK = true;
                break;
            }
        }
        if (palabrasLongitudK) {
            System.out.println("Hay alguna palabra larga.");
        }else{
            System.out.println("Todas las cadenas son cortas.");
        }
    }
}
