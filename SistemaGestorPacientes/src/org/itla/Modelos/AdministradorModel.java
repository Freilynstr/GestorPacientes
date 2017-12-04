/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Modelos;

import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Especialidad;
import org.itla.Entidades.Medico;
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
                + " VALUES('"+usuario.getClave()+"', '"+usuario.getCedula()
                +"', '"+usuario.getNombre()+"', '"+usuario.getApellido()
                +"', '"+usuario.getTelefonos()+"', '"+usuario.getDireccion()
                +"', '"+usuario.getTipo()+")";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);
        
    }
    
    public void editarUsuario(Usuario usuario){
        
        String sql = "UPDATE usuario SET clave='"+usuario.getClave()+"', "
                    +"nombre='"+usuario.getNombre()+"', "
                    +"apellido='"+usuario.getApellido()+"', "
                    +"telefono='"+usuario.getTelefonos()+"', "
                    +"direccion='"+usuario.getDireccion()+"', "
                    +"tipo='"+usuario.getTipo()+"' "
                    +" WHERE cedula="+usuario.getCedula();
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);
        
    }
    
    public void guardarMedico(Medico medico){
        //lo crea como un usuario
        String sql = "INSERT INTO usuario(clave,cedula,nombre,apellido,telefono,direccion,tipo)"
                + " VALUES('"+medico.getClave()+"', '"+medico.getCedula()
                +"', '"+medico.getNombre()+"', '"+medico.getApellido()
                +"', '"+medico.getTelefonos()+"', '"+medico.getDireccion()
                +"', '"+medico.getTipo()+")";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);
        
        //luego lo crea como un médico
        sql = "INSERT INTO medico(especialidad) VALUES('"+medico.getEspecialidad()+"')";
        conexion.insert(sql);
        
    }
    
    public void editarMedico(Medico medico){
        //lo edita como un usuario
        String sql = "UPDATE usuario SET clave='"+medico.getClave()+"', "
                    +"nombre='"+medico.getNombre()+"', "
                    +"apellido='"+medico.getApellido()+"', "
                    +"telefono='"+medico.getTelefonos()+"', "
                    +"direccion='"+medico.getDireccion()+"', "
                    +"tipo='"+medico.getTipo()+"' "
                    +" WHERE cedula="+medico.getCedula();
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);
        
        //luego lo edita como un médico
        sql = "UPDATE medico SET especialidad='"+medico.getEspecialidad()+"', ";
        conexion.insert(sql);
    }
    
    public void guardarEspecialidad(Especialidad especialidad){
        String sql = "INSERT INTO especialidad(nombre) VALUES('"+especialidad.getNombre()+"')";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);      
    }
    
  
}
