public class Duplicados {
    public static void main(String[] args) {
       int[] valores = new int [6];
       int[] valores2 = new int [6]; 

        



        for (int i = 0;i < valores.length; i++ ) {
            for (int j = i +1;j < valores.length; j++ ) {
                if (valores[i] == valores[j]) {
                   
                    System.out.println(valores[i]);
            
                }    
            }
        }
    }
}