package Tema6.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeePrimos {
    
    private static void crearFichero(File f) throws IOException{
        FileReader fileReader1;
        String linia1;
        BufferedReader reader1;
        
        fileReader1 = new FileReader(f);
        reader1 = new BufferedReader(fileReader1);

        if (f.exists()){
            while ((linia1 = reader1.readLine()) != null) {
                if((linia1 != null)){
                    System.out.println(linia1);;
                }
            }
        }
        reader1.close();
    }
    public static void main(String[] args) {
        File f1 = new File("Tema6/Ficheros/primos.dat");

        try {
            crearFichero(f1);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}
