/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Algoritmos;

import java.util.ArrayList;
import java.util.List;
import org.itla.Entidades.Paciente;

/**
 *
 * @author Lenovo
 */
public interface AlgoritmosPacientes {
    public ArrayList<Paciente> buscar(List<Paciente> pacientes,String nombre);
}
