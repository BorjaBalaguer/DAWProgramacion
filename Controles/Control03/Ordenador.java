package Controles.Control03;

public class Ordenador{

    private String formato;
    private String color;
    private Teclado teclado;
    private Ordenador union = null;

    
    public Ordenador(String formato, String color, Teclado teclado) {
        if (formato == "Sobremesa" || formato == "Inalambrico") {
            this.formato = formato;
        }else{
            this.formato = "El formato tiene que ser Sobremesa o Inalambrico";
        }
        this.color = color;
        this.teclado = teclado;
        union = new Ordenador();
    }
    
    public Ordenador() {
        this.formato = "Portatil";
        this.color = "Negro";
        this.teclado = new Teclado();
        union = new Ordenador();
    }

    public String getFormato() {
        return formato;
    }

    public String getColor() {
        return color;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void Conectar(Ordenador ordenador1, Ordenador ordenador2){
        
        ordenador1.union = ordenador2;
    }
}