/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Coneccion;

import java.sql.ResultSet;

/**
 *
 * @author Santiago Pache
 */
public interface Coneccion {
    public ResultSet select(String sql);
    public boolean insert(String sql);
    Coneccion getInstance();
    
}
