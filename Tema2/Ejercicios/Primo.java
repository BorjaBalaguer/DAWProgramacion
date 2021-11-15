public class Primo {
    public static boolean esprimo(int numero) {
        boolean primo = true;
        int divisor = 2;
        
        while ((divisor < numero) && primo) {
            if ((numero % divisor) == 0) {
                primo = false;
            }
            divisor ++;
        }

        return primo;
    }

    public static void main(String[] args) {
        boolean prueba1 = esprimo(65);
        boolean prueba2 = esprimo(11);

        System.out.println(prueba1);
        System.out.println(prueba2);
    }
}