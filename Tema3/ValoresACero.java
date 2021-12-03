public class ValoresACero{
    public static void main(String[] args) {
        /*int[][] matriz = new int[10][10];
        
        int filas = matriz.length;
		int columnas = matriz[0].length;
		for (int i = 0; i < filas; i++){
			for (int j = 0; j < columnas; j++){
			    matriz[i][j] = (int) (Math.random() * (1 - 0 + 1) + 0);
			}
		}*/

        int[][] matriz = {  {0,0,0,0,0,0,0,0,0,0},
                            {0,1,0,0,0,0,0,0,0,0},
                            {0,0,1,0,0,0,0,0,0,0},
                            {0,0,0,1,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0},
                            {0,0,0,0,0,0,1,0,0,0},
                            {0,0,0,0,0,0,0,1,0,0},
                            {0,0,0,0,0,0,0,0,1,0},
                            {0,0,0,0,0,0,0,0,0,1},
    
                        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    if (matriz[i][matriz.length] == 0) {
                        System.out.println("Fila 1 esta todo a 0");
                    }else{
                        break;
                    }
                }
            }
        }
    }
}