package Tema5;
import java.awt.Point;

public class SillaTest {
    public static void main(String[] args) {
        
        Point localizacion;
        localizacion = new Point (3,4);
        Silla s1 = new Silla();
        Silla s2 = new Silla("Negro", 4, true, 8, "Madera", localizacion );

        s1.setColor("Blanco");
        s1.setNumPatas(3);
        s1.set();



        String[] color = {"Blanco", "Verde", "Marron", "Negro" };
        String[] material = {"Madera", "Aluminio", "Plastico", "Piedra"};
        for(int i = 0; 1 <100; i++){
            System.out.println("Silla:" + 1);
        }

        
    }
}
