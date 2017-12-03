package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;

public class LoginModel {

    public LoginModel(){
        
    }
    
    public boolean Autenticar(String codigoEmpleado, String contraseña){
        try {
            Conexion conexion = ConexionMySQL.getInstance();
            ResultSet result = conexion.select("SELECT * FROM usuario WHERE id_usuario = '" + codigoEmpleado + "' AND clave = '"+ contraseña + "'");
            return result.next()==true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
}
