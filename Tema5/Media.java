package Tema5;

import java.util.ArrayList;

public class Media {
    private int id;
    private String nombre;
    private String contenido;
    private String tipo;
    private Usuario usuario_id;

    private static ArrayList<Integer> ids = new ArrayList<>();
    private static ArrayList<String> nombres;

    public Media(int id, String nombre, String contenido, String tipo, Usuario usuario_id) {
        this.id = comprobarId(id);
        this.nombre = comprobarNombre(nombre);
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id;
    }

    private int comprobarId(int id){
        for (int entero : ids) {
            if (ids.contains(id)) { 

            }else{
                ids.add(id);
            }
        }
        return id;
    }

    private String comprobarNombre(String nombre){
        for (String item : nombres) {
            if (nombres.contains(nombre)) { 

            }else{
                nombres.add(nombre);
            }
        }
        return nombre;
    }



}
