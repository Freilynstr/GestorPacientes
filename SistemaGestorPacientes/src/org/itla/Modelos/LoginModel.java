package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.itla.Conexion.ConexionMySQL;

public class LoginModel {

    public LoginModel(){
        
    }
    
    public boolean Autenticar(String codigoEmpleado, String contraseña){
        try {
            Statement exec = /*Aquí va la conexión con la Base de Datos*/.createStatement();
            ResultSet result = exec.executeQuery("SELECT * FROM usuarios WHERE username = '" + codigoEmpleado + "' AND password = '"+ contraseña + "'");
            if(result.next()==true){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
}
