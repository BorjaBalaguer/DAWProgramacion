package Controles.Control04;

import java.util.ArrayList;

public class Cliente extends Persona{

    private int id;
    private String email;

    //Crearemos una variable para que nos vaya creando ids automaticos, incrementando en 1 cuando se cree un objeto de clase Cliente
    private static int idGenerator = 0;

    public static ArrayList<Cliente> list = new ArrayList<>();

    public Cliente(String nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos);
        this.id = idGenerator++;
        this.email = email;
        list.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Id:" + "/n" + id);
        System.out.println("Email:" + "/n" + email);
    }
    
}
