public class Ejemplo40 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;

        System.out.print("1");

        int i = 3;
        int t = n1 + n2;
        
        while (t <= 40) {
                t = n1 + n2;
                n1 = n2;
                n2 = t;
                i = i +1;
                System.out.print("," + n1);
        }   
    }
}