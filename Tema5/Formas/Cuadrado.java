package Tema5.Formas;

public class Cuadrado extends Rectangulo{

    private double lado;

    public Cuadrado(String color, int x, int y, String nombre, double lado) {
        super(color, x, y, nombre, lado, lado);
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
