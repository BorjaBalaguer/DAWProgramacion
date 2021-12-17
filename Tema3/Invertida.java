public class Invertida {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Dame la cadena");
        String []array = dividirEnPalabras(cadena);

        System.out.println(invertir(array));

        
        }
        public static String[] dividirEnPalabras (String cadena) {
            cadena=cadena.trim();
    		cadena=cadena.replaceAll(" +", " ");
    		String [] palabras = cadena.split(" ");
            
            return palabras;
        }

        public static String invertir(String[] palabras) {
            String resultado = "";
            for (int i = palabras.length -1; i >= 0 ; i--) {
                resultado += palabras[i] + " ";
            }
            return resultado;
        }
    
}









