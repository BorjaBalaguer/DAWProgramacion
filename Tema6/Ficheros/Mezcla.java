package Tema6.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Mezcla {

    private static void crearFichero(File f, File e) throws IOException{
        File mezcla = new File("./ficheros/mezcla.txt");

        if (f.exists() & e.exists()) {
            BufferedReader f1 = new BufferedReader(new FileReader(f));
            BufferedReader f2 = new BufferedReader(new FileReader(f));

            String linia = f1.readLine();
        }

    }

    private static void crearFichero2(File f, File e) throws IOException{
        FileOutputStream f_out = new FileOutputStream("./ficheros/mezcla.txt");
        if (f.exists() & e.exists()) {
            FileInputStream f_in1 = new FileInputStream(f);
            FileInputStream f_in2 = new FileInputStream(e);

            int c = f_in1.read();
            int d = f_in2.read();
            
            while (c != -1 & d != -1) {
                f_out.write(c);
                f_out.write(d);
                c = f_in1.read();
                d = f_in2.read();
            }

        }
       

    }
    public static void main(String[] args) {
        FileReader fileReader1;
        FileReader fileReader2;

        BufferedReader reader1;
        BufferedReader reader2;

        try {
            fileReader1 = new FileReader("f1.txt");
            fileReader2 = new FileReader("f2.txt");

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        

    }    
}