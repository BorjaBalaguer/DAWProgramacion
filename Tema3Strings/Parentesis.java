public class Parentesis {
    public static void main(String[] args) {
      
        String cadena1 = Utilidades.leerCadena("Dame la cadena");
      
        int contador = 0;

        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) == '(') {
                contador++;
            }else if (cadena1.charAt(i) == ')') {
                contador--;
            }
            if (contador < 0) {
                break;
            }
        }

        if (contador == 0) {
            System.out.println("La cadena esta bien parentizada.");
        }else{
            System.out.println("La cadena no esta bien parentizada.");
        }
        
    }
}
