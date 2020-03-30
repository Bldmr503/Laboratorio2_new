
package Conexion;

import java.sql.*;

public class ConexionBD {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/farmacias_despertad","root","");
            System.out.println("Se hizo la conexion exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
