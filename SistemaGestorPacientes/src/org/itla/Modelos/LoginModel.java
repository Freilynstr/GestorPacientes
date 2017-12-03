package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Usuario;
import org.itla.Vistas.Login;

public class LoginModel {

    public LoginModel(){
        
    }
    
    public Usuario Autenticar(String codigoEmpleado, String contraseña) throws SQLException{
        Usuario user = new Usuario();
        ResultSet result;
        Conexion conexion = ConexionMySQL.getInstance(); //return false;
        result = conexion.select("SELECT * FROM usuario WHERE id_usuario = '" + codigoEmpleado + "' AND clave = '"+ contraseña + "'");
        if(result.next() == true){
            if("administrador".equals(result.getString("tipo"))){
                    user = new Usuario(result.getInt("id_usuario"), result.getString("nombre"), 
                                                result.getString("tipo"));
                }
        }else{
            user = null;
        }
        return user;
    }
}
