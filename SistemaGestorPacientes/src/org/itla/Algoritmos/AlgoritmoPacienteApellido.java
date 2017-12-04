
package org.itla.Algoritmos;

import java.util.ArrayList;
import java.util.List;
import org.itla.Entidades.Paciente;

public class AlgoritmoPacienteApellido implements AlgoritmosPacientes{
    
    public AlgoritmoPacienteApellido(){
        
    }
    @Override
    public ArrayList<Paciente> buscar(List<Paciente> pacientes,String apellido){
        boolean pertenece=true;
        ArrayList<Paciente> encontrados= new ArrayList<>();
        for(Paciente paciente:pacientes){
            for(int i=0;i<apellido.length();i++){
                pertenece=true;
                if(paciente.getApellido().charAt(i)!=apellido.charAt(i)){
                    pertenece=false;
                    break;
                }
            }
            if(pertenece==true)
                encontrados.add(paciente);
        }
        return encontrados;
    }
    
}
