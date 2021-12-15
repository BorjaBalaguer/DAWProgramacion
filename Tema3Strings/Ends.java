public class Ends {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        String cadena2 = Utilidades.leerCadena("Dame la cadena2");

        boolean acaba = cadena1.endsWith(cadena2);

        if (acaba) {
            System.out.println("La cadena1 acaba con la cadena2");
        }else{
            System.out.println("La cadena1 no acaba con la cadena2");
        }
    }
}