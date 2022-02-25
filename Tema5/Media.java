package Tema5;

import java.util.ArrayList;

import Tema5.TicketMachine.MediaType;

public class Media {
    private int id;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario_id;

    private static ArrayList<Integer> ids = new ArrayList<>();
    private static ArrayList<String> nombres = new ArrayList<>();
    private static ArrayList<Media> Medias = new ArrayList<>();

    public Media(int id, String nombre, String contenido, MediaType tipo, Usuario usuario_id) {
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

    private void eliminarMedia(String nombre){
        for (Media media : Medias) {
            if (media.nombre.equals(nombre)) {
                Medias.remove(media);
                break;
            }
        }
    }

    private void eliminarTodosMedia(MediaType tipo){
        for (Media media : Medias) {
            if (media.tipo.equals(tipo)) {
                Medias.remove(media);
            }
        }
    }



}
