public class ArgumentosSuma {
    public static void main(String[] args) {

        //Declaración de variables
        int suma = 0;

        System.out.println("--------------------------");
        System.out.println("Argumentos: " + args.length);
        System.out.println("--------------------------");

        for (int i = 0; i < args.length; i++) {
            int temp = Integer.parseInt(args[i]);
            suma += temp;
        }
        System.out.println(suma);
        System.out.println("--------------------------");
    }
}