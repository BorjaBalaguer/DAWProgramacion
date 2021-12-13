public class Substring {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        int inicio = Utilidades.leerEntero("Dame la letra que quieres eliminar");
        int final = Utilidades.leerEntero("Dame la letra por la que quieres que sea sustituida");
        
        System.out.println("Resultado final: " + cadena1.substring(inicio, final));
    }
}
