public class Potencia {
    public static double potencia(double x, int n) {
        if(n == 0){
            return 1;
        }else{
            return x * potencia(x, n-1);
        }
        
    }
    public static void main(String[] args) {
        double prueba1 = potencia(2,3); 

        System.out.println(prueba1);
    }
}