package Tema5;

/* Crearemos una clase silla con atributos de color, numero de patas, si tiene respaldo o no, nivel de comodidad y material 
la sillas tienen una localizacion que estan ubicadas en una habitacion con las coordenas de la ubicacion
todos los atributos tienen que ser privados pero desde la clase de test podremos modificarlos
en la clase de prueba creamos de manera aleatoria 100 sillas con distintos atributos */

public class Silla {

    //Zona de atributos de objetos
    private String color;
    private int patas;
    private boolean respaldo;
    private int comodidad;
    private String material;

    public Silla(String colorE, int patas, boolean respaldo, int comodidad, String material){
        color = colorE;
        patas = patas;
        respaldo = respaldo;
    }
    
}
