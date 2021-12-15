public class Longitud2 {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena:");
        String palabras[] = Utilidades.dividirEnPalabras(cadena1);
        System.out.println("----------------");
        int longitud = Utilidades.leerEntero("Dame un numero de caracteres:");
        System.out.println("----------------");
        boolean palabrasLongitudK= false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud ) {
                palabrasLongitudK = true;
                break;
            }
        }
        if (palabrasLongitudK) {
            System.out.println("Hay 1 o mas palabras con la longitud de " + longitud + " caracteres.");
        }else{
            System.out.println("No hay alguna palabra con la longitud de " + longitud + " caracteres.");
        }
        
    }
}
