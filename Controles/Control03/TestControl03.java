package Controles.Control03;

public class TestControl03 {
    
    public static void main(String[] args) {
      
        Teclado t1, t2;

        t1 = new Teclado();
        t2 = new Teclado("Negro", 55, "Cabe", "es", "Comacto");

        Teclado.saberNumeroTeclados();
    }
}