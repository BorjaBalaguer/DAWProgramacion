package Tema5.Formas;

public class Elipse extends Forma{

    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, int x, int y, String nombre, double radioMayor, double radioMenor) {
        super(color, x, y, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    
    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    public double getArea(){
        return Math.PI * (radioMayor * radioMenor);
    }
    

    public void imprimir(){
        super.imprimir();
        System.out.println("Radio mayor: " + radioMayor);
        System.out.println("Radio menor; " + radioMenor);
    }


}
