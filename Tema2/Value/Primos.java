public class Primos {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++) {
            boolean resultado = Primo.esprimo(i);

            if (resultado) {
                System.out.println(i);
            }
        }
    }
}