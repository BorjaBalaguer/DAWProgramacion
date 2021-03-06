package Tema6.Ficheros;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    private static void imprimirFichero(File e, int id) {
        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        
        String permisos = saberPermisos(e);

        if (!e.isHidden()) {

           if (e.isFile()) {

               System.out.println(id + ".- \t" + permisos + "\t" + String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());

            }

           if (e.isDirectory()){

               System.out.println(id + ".- \t" + permisos + "\t" + String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());

            }

        }

    }

    private static String saberPermisos(File e) {
        String permisos = "";

        if (e.isDirectory()) {
            permisos = "d";
        }else{
            permisos = "-";
        }
        if (e.canRead()) {
            permisos += "r";
        }else{
            permisos += "-";
        }
        if (e.canWrite()) {
            permisos += "w";
        }else{
            permisos += "-";
        }
        if (e.canExecute()) {
            permisos += "x";
        }else{
            permisos += "-";
        }
        return permisos;
    }

   private static void imprimirDirectorio(File f) throws IOException {

    int contador = 1;

    if (f.exists()) {

        if (f.isDirectory()) {

            System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());

            System.out.println("---------------------------------------------------");

            if (f.getParent() != null) {
                System.out.println("0.- Directorio padre");
            }

            for (File e : f.listFiles()){

                imprimirFichero(e, contador++);

            }

        } else {

            System.out.println("No es un directorio");

        }

    } else {

        System.out.println("No existe el directorio");

    }

    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        String entradaUsuario = "";
        int resultado = 0;

        System.out.print("Introduce una opcion(-1 para salir):");

        entradaUsuario = teclado.nextLine();

        resultado = Integer.parseInt(entradaUsuario);

        return resultado;
    }

    public static void main(String[] args) throws IOException {

        File f = File.listRoots()[0];
        int opcion;
        
        do {
            imprimirDirectorio(f);
            opcion = leerOpcion();

            if (opcion >= 1 && opcion <= f.listFiles().length) {

                File nextFile = f.listFiles()[opcion-1];

                if (nextFile.isDirectory() && nextFile.canRead()) {
                    f = nextFile; 
                }
            }else if(f.getParent() !=null && opcion == 0){
                f = f.getParentFile();
            }
        } while (opcion != -1);
    }
}