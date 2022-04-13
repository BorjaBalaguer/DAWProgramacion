package Tema6.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class Mezcla {

    private static void crearFichero(File f, File e) throws IOException{
        FileReader fileReader1;
        FileReader fileReader2;
        String linia1;
        String linia2;
        File mezcla = new File("Tema6/Ficheros/mezcla.txt");
        FileOutputStream writer = new FileOutputStream(mezcla);
        PrintWriter pw = new PrintWriter(mezcla);
        BufferedReader reader1;
        BufferedReader reader2;
        
        fileReader1 = new FileReader(f);
        fileReader2 = new FileReader(e);

        reader1 = new BufferedReader(fileReader1);
        reader2 = new BufferedReader(fileReader2);

        if (f.exists()& e.exists()){
            while ((linia1 = reader1.readLine()) != null | (linia2 = reader2.readLine()) != null) {
                if((linia1 != null)){
                    pw.println(linia1);
                }
                if((linia2 != null)){
                    pw.println(linia2);
                }
            }
        }
        reader1.close();
        reader2.close();
        pw.close();
    }
    public static void main(String[] args) throws IOException {
        FileReader fileReader1;
        FileReader fileReader2;

        BufferedReader reader1;
        BufferedReader reader2;

        File f1 = new File("Tema6/Ficheros/f1.txt");
        File f2 = new File("Tema6/Ficheros/f2.txt");

        crearFichero(f1, f2);

        try {
            fileReader1 = new FileReader("Tema6/Ficheros/f1.txt");
            fileReader2 = new FileReader("Tema6/Ficheros/f2.txt");

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }    
}