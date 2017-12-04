/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Padecimiento;
import org.itla.Entidades.Recetas;

/**
 *
 * @author Freddy
 */
public class MedicoModel {
    Conexion conexion;
    public MedicoModel(){
        conexion=ConexionMySQL.getInstance();
    }
    
    public void crearPadecimiento(Padecimiento padecimiento){
        String sql = "INSERT INTO padecimiento(nombre) VALUES('"+padecimiento.getNombrePadecimiento()+"')";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);  
    }
    
    public void editarPadecimiento(Padecimiento padecimiento){
        String sql = "UPDATE padecimiento SET nombre='"+padecimiento.getNombrePadecimiento()+"'"
                + " WHERE nombre='"+padecimiento.getNombrePadecimiento()+"'";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql);        
    }
    
    public void crearReceta(Recetas receta){
        //obtener id medico
        String cedulaMedico = receta.getMedico().getCedula();
        String id_medico = "";
        String sql="SELECT id_usuario from usuario WHERE cedula='"+cedulaMedico+"'";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        ResultSet resultado=conexion.select(sql);
        try{
            if(resultado.next()){
                id_medico = resultado.getString("id_usuario");
            }
        }catch(SQLException ex){
        }
        
        //obtener id paciente
        String cedulaPaciente = receta.getPaciente().getCedula();
        String id_paciente = "";
        sql="SELECT id_paciente from paciente WHERE cedula='"+cedulaPaciente+"'";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        resultado=conexion.select(sql);
        try{
            if(resultado.next()){
                id_paciente = resultado.getString("id_paciente");
            }
        }catch(SQLException ex){
        }
        
        
        //llenar la tabla receta
        sql = "INSERT INTO receta(medico,paciente) "
            + "VALUES("+id_medico+","+id_paciente+")";
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        conexion.insert(sql); 
        
        //llenar la tabla receta_medicamento
    }
  
}
