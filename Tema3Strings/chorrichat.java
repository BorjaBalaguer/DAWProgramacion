public class chorrichat {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("ChorriChat  -->");
        boolean aSaludado = saludo(cadena);

        while(!aSaludado) {
            System.out.println("Eres una persona maleducada");
            cadena = Utilidades.leerCadena("ChorriChat  -->");
        }
        System.out.println("Hola soy Chorri tu asistente");
        
    }

    public static boolean saludo(String cadena) {
        String[] palabraSaludo = Utilidades.dividirEnPalabras(cadena);
        boolean resultado = false;

        switch (palabraSaludo[0]) {
            case "hola":
            case "buenos":
                if (palabraSaludo[1] == "dias") {
                    resultado = true;
                }
            case "buenas":
                resultado = true;

                break;

            default:
                resultado = false;
                break;
        }
        
        return resultado;
    }
}
