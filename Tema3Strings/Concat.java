public class Concat {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        String cadena2 = Utilidades.leerCadena("Dame la cadena2");

        System.out.println(cadena1.concat(cadena2));
    }
}
