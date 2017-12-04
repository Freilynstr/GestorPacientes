/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Funcionalidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Medico;
import org.itla.Entidades.Paciente;

/**
 *
 * @author Lenovo
 */
public class FuncionalidadAsistente implements Funcionalidad {
    private ArrayList<Medico> medicos;
    private Conexion conexion;
    
    public ArrayList<Paciente> pacientes(){
        ArrayList<Paciente> pacientes=new ArrayList<Paciente>();
        String sql="select * from pacientes";
        conexion=ConexionMySQL.getInstance();
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        ResultSet resultado=conexion.select(sql);
        try{
            while(resultado.next()){
                pacientes.add(
                        new Paciente(
                                resultado.getString("nombre"),
                                resultado.getString("apellido"),
                                resultado.getString("cedula")
                        )
                );
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return pacientes;
    }
    
}
