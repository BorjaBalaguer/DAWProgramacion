public class Mates {

    //Declaración de variables
    public static double suma (double x, double y){
        double resultado = 0;
        resultado = x + y;

        return resultado;
    }
        public static double resta (double x, double y){
        double resultado = 0;
        resultado = x - y;

        return resultado;
    }
    public static double multiplicacion (double x, double y){
        double resultado = 0;
        resultado = x * y;

        return resultado;
    }
    public static double division (double x, double y){
        double resultado = 0;
        resultado = x / y;

        return resultado;
    }
    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println("Suma: " + suma(2,4));
        System.out.println("---------------------");
        System.out.println("Resta: " + resta(2,4));
        System.out.println("---------------------");
        System.out.println("Multiplicacion: " + multiplicacion(2,4));
        System.out.println("---------------------");
        System.out.println("Division: " + division(2,4));

    }
}