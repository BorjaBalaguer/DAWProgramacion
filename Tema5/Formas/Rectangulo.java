package Tema5.Formas;

public class Rectangulo extends Forma {

    private double ladoMayor;
    private double ladoMenor;

    public Rectangulo(String color, int x, int y, String nombre, double ladoMayor, double ladoMenor) {
        super(color, x, y, nombre);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
 
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Lado mayor: " + ladoMayor);
        System.out.println("Lado menor: " + ladoMenor);
    }

    public double calcularArea(){
        return ladoMenor * ladoMayor;
    }

    public double calcularPerimetro(){
        return ((2 * ladoMenor) + (2 * ladoMayor));
    }

    public void cambiarTamaño(double factor){
        this.ladoMayor *= factor;
        this.ladoMenor *= factor;
    }
}