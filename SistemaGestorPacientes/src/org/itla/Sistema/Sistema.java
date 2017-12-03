package org.itla.Sistema;

import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Vistas.Login;

public class Sistema {
    public static void main(String[] args) {
        
        Conexion conection = ConexionMySQL.getInstance();
        conection.conectar("localhost","root","","gestorpacientes");
        
        Login login = new Login();
        login.setVisible(true);
    }
}
