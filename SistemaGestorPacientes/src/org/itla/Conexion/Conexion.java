/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Conexion;

import java.sql.ResultSet;

/**
 *
 * @author Santiago Pache
 */
public interface Conexion {
    public ResultSet select(String sql);
    public boolean insert(String sql);
    public static Conexion getInstance(String host,String use,String key,String database);
}
