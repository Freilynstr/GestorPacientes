/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.Algoritmos;

import java.util.ArrayList;
import java.util.List;
import org.itla.Entidades.Medico;

/**
 *
 * @author Lenovo
 */
public class AlgoritmoMedicoEspecialidad implements AlgoritmoMedicos{

    @Override
    public ArrayList<Medico> buscarMedicos(List<Medico> medicos,String Especialidad) {
        ArrayList<Medico> medicosEspecialidad=new ArrayList<>();
        for(Medico medico:medicos){
            if(medico.getEspecialidad().getNombre().equals(Especialidad)){
                medicosEspecialidad.add(medico);
            }
        }
        return medicosEspecialidad;
    }
    
}
