public class Remplazar {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        char letra1 = Utilidades.leerCaracter("Dame la letra que quieres eliminar");
        char letra2 = Utilidades.leerCaracter("Dame la letra por la que quieres que sea sustituida");

        System.out.println("Resultado final: " + cadena1.replace(letra1, letra2));
    }
}
