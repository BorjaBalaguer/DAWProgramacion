package Tema6.Ficheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {


    public static void main(String[] args) {

        File f = File.listRoots()[0];
        int i = 1;

        System.out.println("Lista de ficheros y directorios del directorio: " + f.getPath());
        System.out.println("---------------------------------------------------");

        for (String e : f.list()) {
            File x = new File(e);
            if (x.isDirectory()) {
                System.out.println(i + ".- " + e + "<directorio>");
            }else{
                System.out.println(i + ".- " + e + " " + x.length());
            }
            i++;
        }
    }
}