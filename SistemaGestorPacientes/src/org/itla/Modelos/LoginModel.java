package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
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
    
    public Boolean Autenticar(String codigoEmpleado, String contraseña) throws SQLException{
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
                    asistente.setVisible(true);
                    break;
                case "medico":
                    Medico medico = Medico.getInstance();
                    medico.setVisible(true);
                    break;
                case "administrador":
                    Administrador admin = Administrador.getInstance();
                    admin.setVisible(true);
                    break;
                default:
                    break;
            }
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            return false;
        }
    }
}
