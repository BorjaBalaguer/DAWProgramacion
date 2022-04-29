package Controles.Control04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PersistenciaCliente {
    
    private static void write(ArrayList list) throws IOException{
        File clientes = new File("Controles/Control04/clientes.dat");
        PrintWriter pw = new PrintWriter(clientes);

        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i));
        }
    }
    private static void read(String f) throws IOException{
        FileReader fileReader1;
        String linia1;
        File mezcla = new File("Controles/Control04/" + f);
        PrintWriter pw = new PrintWriter(mezcla);
        BufferedReader reader1;
 
    }
    public static void main(String[] args) throws IOException {
        Cliente c1 = new Cliente("12345678L", "Borja", "Balaguer Martinez", "alu6588@ieselcaminas.org");
        write(Cliente.list);
    }
}