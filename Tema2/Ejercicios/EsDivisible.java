import java.util.Scanner;

public class EsDivisible {
    
    public static boolean esDivisible(int n, int m){

        boolean divisible = false;

        if (n % m == 0) {
            divisible = true;
        }else{
            divisible = false;
        }

        return divisible;
    }
}