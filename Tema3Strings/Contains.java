public class Contains {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        String cadena2 = Utilidades.leerCadena("Dame la cadena2");

        boolean contiene = cadena1.contains(cadena2);

        if (contiene) {
            System.out.println("La cadena1 contiene la cadena2");
        }else{
            System.out.println("La cadena1 no contiene la cadena2");
        }
    }
}