/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Sistema;

import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;

/**
 *
 * @author Santiago Pache
 */
public class Sistema {
    public static void main(String[] args) {
        Conexion conection = ConexionMySQL.getInstance("localhost","root","","gestorpacientes");
    }
}
