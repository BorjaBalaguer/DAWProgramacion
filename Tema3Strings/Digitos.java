public class Digitos {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Dame la cadena:");

        System.out.println("Hay "+ digitos(cadena) + " digitos en la cadena: '" + cadena + "'.");
    }

    public static int digitos(String cadena) {
        int contador = 0;
		for(int i = 0; i < cadena.length(); i++){
			if (Character.isDigit(cadena.charAt(i))){
				contador++;
			}
		}
        return contador;
    }
}