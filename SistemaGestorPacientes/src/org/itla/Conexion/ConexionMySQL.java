/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Santiago Pache
 * @author Freddy Rondon
 */
public class ConexionMySQL implements Conexion{

    private static ConexionMySQL instancia;
    private Connection coneccion;
    private Statement enunciado;
    
    @Override
    public ResultSet select(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conexion getInstance(String host,String user,String key,String database) {
        if(instancia==null){
            instancia=new ConexionMySQL(host,user,key,database);
        }
        return instancia;
    }
    
    
    private ConexionMySQL(String host,String user,String key,String database){
        try {
            //Cargar en memoria el driver de MySql
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            coneccion=DriverManager.getConnection("jdbc:mysql://"+host+"/"+database+"?user="+user+"&password="+key);
            enunciado=(Statement) coneccion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
