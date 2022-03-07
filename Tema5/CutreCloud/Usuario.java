package Tema5.CutreCloud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Usuario implements ParseXML{
    private int id;
    private String email;
    private String password;

    public static ArrayList<Usuario> list = new ArrayList<>();
    private static int idGenerator;

    private static ArrayList<Integer> ids;
    private static ArrayList<String> emails;


    public Usuario(){
        this.id = idGenerator++;
        this.email = "nonuser@gmail.com";
        this.password = "xxxx1234";
    }

    public Usuario(String email, String password){
        this.id = idGenerator++;
        this.email = comprobarEmail(email);
        this.password = password;

        list.add(this);
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static String comprobarEmail(String email){
        for (String correo : emails) {
            if (emails.contains(email)) { 

            }else{
                emails.add(email);
            }
        }
        return email;
    }

    private void eliminarUsuario(String email){
        for (Usuario items: list) {
            if (items.email.equals(email)) {
                emails.remove(items);
                break;
            }
        }
    }

    public String generateXML(){
        return  "<usuario>" +
                "<id>" + this.id + "</id>" +
                "<email>" + this.email + "</email>" +
                "<password>" + this.password + "</password>" +
                "</usuario>";
    }

    public void writeXML(){
        
        try {

            String ruta = "Tema5/CutreCloud/xmlCreados/Usuario" + id + ".xml";
            String contenido = this.toString();
            
            File file = new File(ruta);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}