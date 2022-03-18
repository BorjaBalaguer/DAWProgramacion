package Tema5.Formas;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<Forma>();
        Forma f1 = new Forma("rojo", 2, 3, "forma1");
        f1.imprimir();
        f1.mover(7, 8);
        f1.imprimir();
        f1.setColor("amarillo");
        f1.imprimir();

        lista.add(f1);

        Rectangulo r1 = new Rectangulo("rojo", 4, 5, "forma2", 8, 7);

        r1.imprimir();
        r1.mover(7, 8);
        r1.imprimir();
        r1.setColor("amarillo");
        f1.imprimir();

        lista.add(r1);

        Circulo c1 = new Circulo("verde", 1, 0, "circulito", 2);

        lista.add(c1);

        Elipse e1 = new Elipse("negro", 1, 1, "elipsita", 3, 4);

        lista.add(e1);

        for (Forma forma : lista) {
            forma.mover(0, 0);
            forma.setColor("rojo");
            forma.imprimir();
        }

    }
}
