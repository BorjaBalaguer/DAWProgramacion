package Tema5;
import java.awt.Point;

/* Crearemos una clase silla con atributos de color, numero de patas, si tiene respaldo o no, nivel de comodidad y material 
la sillas tienen una localizacion que estan ubicadas en una habitacion con las coordenadas de la ubicacion
todos los atributos tienen que ser privados pero desde la clase de test podremos modificarlos
en la clase de prueba creamos de manera aleatoria 100 sillas con distintos atributos */

public class Silla {

    //Zona de atributos de objetos
    private String color;
    private int patas;
    private boolean respaldo;
    private int comodidad;
    private String material;
    private Point localizacion;

    //Setters
    public void setComodidad(int nuevaComodidad){
        comodidad = nuevaComodidad;
    }
    public void setColor(String nuevoColor){
        color = nuevoColor;
    }public void setColor(String nuevoColor){
        color = nuevoColor;
    }
    public void setNumPatas(int nuevoNumPatas){
        if (nuevoNumPatas < 0) {
            patas = 0;
        }else if(nuevoNumPatas > 100){
            patas = 100;
        }else{
            patas = nuevoNumPatas;
        }

    }

    public Silla(){

    }
    public Silla(String color, int patas, boolean respaldo, int comodidad, String material, Point localizacion){
        this.color = color;
        this.patas = patas;
        this.respaldo = respaldo;
        this.comodidad = comodidad;
        this.material = material;
        this.localizacion = localizacion;
    }    
}