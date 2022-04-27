package Tema6.Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarPalabra {
    
    public void leerFichero() throws IOException{

        String n_archivo;
        String palabra;
        String contenido;
        int contador = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame el nombre del archivo: ");
        n_archivo = lector.nextLine();

        FileReader archivo = new FileReader("Tema6/Ficheros/" + n_archivo);
        BufferedReader br = new BufferedReader(archivo);

        System.out.println("Dame una palabra: ");
        palabra = lector.nextLine();

        while((contenido = br.readLine())!=null) { 
            String[] palabras = contenido.split(" ");

            for (int i = 0; i < palabras.length; i++) {
                if(palabras[i].equals(palabra)){
                    contador++;
                }
            }
        }

        System.out.println("Se ha repetido " + contador + " veces" + " la palabra " + palabra + " .");

        lector.close();
        archivo.close();
        br.close();
    }
}