package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Usuario;
import org.itla.Vistas.Administrador;
import org.itla.Vistas.Asistente;
import org.itla.Vistas.Medico;

public class LoginModel {

    public LoginModel(){
        
    }
    
    public void Autenticar(String codigoEmpleado, String contraseña) throws SQLException{
        Conexion conexion = ConexionMySQL.getInstance();
        Usuario user = new Usuario();
        ResultSet result;
        
        result = conexion.select("SELECT * FROM usuario WHERE id_usuario = '" + codigoEmpleado + "' AND clave = '"+ contraseña + "'");
        if(result.next() == true){
            if("administrador".equals(result.getString("tipo"))){
                    user = new Usuario(result.getInt("id_usuario"), result.getString("nombre"), 
                                                result.getString("tipo"));
                }
        }else{
            user = null;
        }
        if(user != null){
            if(null != user.getTipo())switch (user.getTipo()) {
                case "asistente":
                    Asistente asistente = Asistente.getInstance();
                    break;
                case "medico":
                    Medico medico = Medico.getInstance();
                    break;
                case "administrador":
                    Administrador admin = Administrador.getInstance();
                    break;
                default:
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }
}
