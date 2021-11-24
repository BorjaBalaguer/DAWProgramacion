public class Duplicados {
    public static void main(String[] args) {
       int[] valores ={10,12,16,14,10,14,18}; 

        
        for (int i = 0;i < valores.length; i++ ) {
            if (valores[0] == valores[i]) {
                System.out.println(valores[i]); 
            }
        }
    }
}