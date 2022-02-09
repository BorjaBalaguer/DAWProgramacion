package Tema5.Alumno;

public class AlumnoTest {
    
    public static void main(String[] args) {
        Alumno a1, a2, a3, a4;

        a1 = new Alumno("Pablo", 1);
        a2 = new Alumno("Maria", 2, "1CFSJ");
        a3 = new Alumno("Manuel", 3, "1CFSK");
        a4 = new Alumno("Francisco", 4);

        a2.preguntarDuda();
        a1.preguntarDuda();

        Alumno[] lista = {a1,a2,a3,a4};

        Alumno.imprimirInforme();
        Alumno.imprimirInformeAlumnos(lista);
    }
}
