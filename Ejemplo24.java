import  java.util.Scanner ;

 clase  pública Ejemplo24 {
    public  static  void  main ( String [] args ) {
        
        int   nota, notaMedia =  0 , suma =  0 , contador =  0 , notaDiez =  0 ;
        Scanner valorEntrante;
        valorEntrante =  nuevo  escáner ( System . in);

        
        Sistema . fuera . println ( " Escribeme tus notas para calcular la media y para finalizar escribe el -1: " );
        nota = valorEntrante . nextInt ();

        while (nota ! =  - 1 ) {
            contador ++ ;
            suma = suma + nota;
            notaMedia = suma / contador;

            si (nota ==  10 ) {
                notaDiez ++ ;
            }
            
            nota = valorEntrante . nextInt ();

        }

        if (notaDiez > =  1 ) {
            Sistema . fuera . println ( " Habia al menos un 10 entre todas las notas introducidas. " );
        } más {
            Sistema . fuera . println ( " NO habia ni un 10 entre todas las notas introducidas. " );
        }

        Sistema . fuera . println ( " La media de las notas es: "  + notaMedia);

        valorEntrante . cerrar();
    }    
}
