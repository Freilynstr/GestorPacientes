/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Paciente;
import org.itla.Entidades.Usuario;

/**
 *
 * @author Freddy
 */
public class AdministradorModel {
    Conexion conexion;
    public AdministradorModel(){
        conexion=ConexionMySQL.getInstance();
    }
    
    public void guardarUsuario(Usuario usuario){
        
        String sql = "INSERT INTO usuario(clave,cedula,nombre,apellido,telefono,direccion,tipo)"
                + " VALUES("+usuario+")";
        
    }
  
}
