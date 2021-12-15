public class Substring {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena");
        int inicio = Utilidades.leerEntero("Dame la posicion inicial de la cadena que quieres eliminar");
        int fin = Utilidades.leerEntero("Dame la posicion final de la cadena que quieres eliminar");
        
        System.out.println("Cadena extraida: " + cadena1.substring(inicio, fin));
    }
}
