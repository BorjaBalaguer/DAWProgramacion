package Tema5;
/*Crearemos una clase de tipo alumnno que tendra como atributos un ID, nombre y un grupo
Se pueden crear alumnos solo con el nombre i el ID o tambien con todo
Tiene que tener un metodo que se llamara preguntarDuda que tendra que imprimir el nombre del alumno mas "levanta la mano"
tendremos que tener un contador del total de alumnos creados
tendremos un metodo de clase llamado imprimirInforme que muestra el total de alumnos
otro metodo que se llama imprimirInformeAlumnos que se le pasara un array de alumnos e imprime el nombre y grupo de cada alumno*/

class Alumno {
    
    //Zona de atributos de clase
    private static int totalAlumnos = 0;
    //Zona de atributos de objetos
    private int id;
    private String nombre;
    private String grupo;
    

    public static void imprimirInforme(){
        System.out.println("Total de alumnos: " + totalAlumnos);
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
        grupo = "No asignado";
        totalAlumnos++;
    }

    public Alumno(String n, int i, String g){
        nombre = n;
        id = i;
        grupo = g;
        totalAlumnos++;
    }

    public void preguntarDuda(){
        System.out.println(nombre + " levanta la mano");
    }

    public static void imprimirInformeAlumnos(Alumno[] alumnos){
        System.out.println("Nombre\t\t\tGrupo");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + "\t\t\t" + alumno.grupo);
        }
    }
}