public class IndexOf{
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Dame la cadena1");
        String cadena2 = Utilidades.leerCadena("Dame la cadena2");

        if (cadena1.indexOf(cadena2) > 0) {
            System.out.println("La cadena2 aparece en la posicion: " + cadena1.indexOf(cadena2) + " de la cadena1");
        }else{
            System.out.println("La cadena2 no aparece en ninguna posicion de la cadena1");
        }
      
    }
}