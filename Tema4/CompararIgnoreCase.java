public class CompararIgnoreCase{
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        String cadena2 = Utilidades.leerCadena("Dame la cadena2");

        int comparacion = cadena1.compareToIgnoreCase(cadena2);

        if (comparacion < 0) {
            System.out.println("La cadena1 es mayor a la cadena2");
        }else if(comparacion == 0){
            System.out.println("Las dos cadenas son iguales");
        }else if(comparacion > 0){
            System.out.println("La cadena1 es menor que la cadena2");
       }
    }
}