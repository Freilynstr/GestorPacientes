/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Modelos;

import org.itla.Conexion.Conexion;
import org.itla.Conexion.ConexionMySQL;

/**
 *
 * @author Lenovo
 */
public class Asistente {
    Conexion conecion;
    public Asistente(){
        conecion=ConexionMySQL.getInstance();
    }
}
