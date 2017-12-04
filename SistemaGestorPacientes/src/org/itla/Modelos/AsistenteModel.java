/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;
import org.itla.Entidades.Medico;
import org.itla.Entidades.Paciente;

/**
 *
 * @author Lenovo
 */
public class AsistenteModel {
    Conexion conexion;
    public AsistenteModel(){
        conexion=ConexionMySQL.getInstance();
    }
    
    public ArrayList<String> Especialidades(){
        ArrayList<String> especialidades=new ArrayList<String>();
        String sql="select * from especialidad";
        conexion=ConexionMySQL.getInstance();
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        ResultSet resultado=conexion.select(sql);
        try{
            while(resultado.next()){
                especialidades.add(resultado.getString("nombre"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return especialidades;
    }
    
    public ArrayList<Medico> medicoEspecialidades(){
        ArrayList<Medico> medico=new ArrayList<>();
        String sql="select u.nombre,e.nombre as especialidad from especialidad as e\n" +
            "inner join medico as m\n" +
            "on e.id_especialidad=m.especialidad\n" +
            "inner join usuario as u\n" +
            "on u.id_usuario=m.id_medico";
        conexion=ConexionMySQL.getInstance();
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        ResultSet resultado=conexion.select(sql);

        try{
            while(resultado.next()){
                JOptionPane.showMessageDialog(null, resultado.getString("nombre"));
                medico.add(new Medico(resultado.getString("nombre"),resultado.getString("especialidad")));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return medico;
    }
    
    public ArrayList<Paciente> pacientes(){
        ArrayList<Paciente> pacientes=new ArrayList<Paciente>();
        String sql="select * from paciente";
        conexion=ConexionMySQL.getInstance();
        conexion.conectar("localhost", "root", "", "gestorPacientes");
        ResultSet resultado=conexion.select(sql);
        try{
            while(resultado.next()){
                pacientes.add(
                        new Paciente(
                                resultado.getString("cedula"),
                                resultado.getString("nombre"),
                                resultado.getString("apellido")
                                
                        )
                );
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return pacientes;
    }
}
