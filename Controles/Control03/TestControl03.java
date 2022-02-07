package Controles.Control03;

public class TestControl03 {
    
    public static void main(String[] args) {
      
        Teclado t1, t2;
        Ordenador o1 , o2;

        t1 = new Teclado();
        t2 = new Teclado("Negro", 55, "Cabe", "es", "Comacto");

       
        o1 = new Ordenador();
 
        o2 = new Ordenador();

       // o1.Conectar(o1, o2);

        Teclado.saberNumeroTeclados();
    }
}