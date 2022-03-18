package Tema5.Formas;

public class Circulo extends Elipse{

    private double radio;

    public Circulo(String color, int x, int y, String nombre, double radio) {
        super(color, x, y, nombre, radio, radio);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro(){
        return 2 * Math.PI * radio;
    }
}
