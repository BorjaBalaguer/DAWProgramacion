package Tema7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class MySqlInsert {

    public static void main(String[] args) throws ClassNotFoundException {
       
        String consulta = " insert into Cliente (nombre, apellidos, nif, email)"
        + " values (?, ?, ?, ?)";
        String connectioURL = "jdbc:mysql://10.0.2.4:3306/Clientes";
 
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
       
        Connection conn =DriverManager.getConnection(connectioURL,"phpmyadmin","phpmyadmin");
             PreparedStatement ps = conn.prepareStatement(consulta);
             Scanner lector = new Scanner(System.in);
             
             System.out.println("Introduzca el nombre");
             String nombre = lector.nextLine();

             System.out.println("Introduzca el apellido");
             String apellido = lector.nextLine();

             System.out.println("Inserta el email");
             String nif = lector.nextLine();

             System.out.println("Introduzca el nif");
             String email = lector.nextLine();
             

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, email);
            ps.setString(4, nif);

            ps.execute();
            conn.close();
            lector.close();
    
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
     }
 }