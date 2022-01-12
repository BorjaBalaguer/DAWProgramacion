/*Crearemos una clase de tipo alumnno que tendra como atributos un ID, nombre y un grupo
Se pueden crear alumnos solo con el nombre i el ID o tambien con todo
Tiene que tener un metodo que se llamara preguntar duda que tendra que imprimir el nombre del alumno mas "levanta la mano"
tendremos que tener un contador del total de alumnos creados
tendremos un metodo de clase llamado imprimirInforme que muestra el total de alumnos
otro metodo que se llama imprimirInformeAlumnos que se le pasara un array de alumnos e imprime el nombre y grupo de cada alumno*/

class Alumno {
    

    private static int totalAlumnos = 0;

    private int id;
    private String nombre;
    private String grupo;
    

    static void imprimirInforme(){
        System.out.println(totalAlumnos);
    }

    public Alumno(){
        nombre = "Jose";
        id = 0;
        grupo = "ESO";
        totalAlumnos++;
    }

    public Alumno(String n, int i){
        nombre = n;
        id = i;
        totalAlumnos++;
    }

    public Alumno(String n, int i, String g){
        nombre = n;
        id = i;
        grupo = g;
        totalAlumnos++;
    }

    static void preguntarDuda(String nombre){
        String alumno  = nombre;
        System.out.println(alumno + " levanta la mano");
    }

    public static void main(String[] args) {
        Alumno a1, a2, a3;
        a1 = new Alumno();
        a2 = new Alumno("Borja", 112);
        a3 = new Alumno("Joel", 232, "1DAW");
        a2.preguntarDuda("Borja");

        Alumno.imprimirInforme();
    }
}
