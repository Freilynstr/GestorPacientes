
package org.itla.Algoritmos;

import java.util.ArrayList;
import java.util.List;
import org.itla.Entidades.Paciente;

public class AlgoritmoPacienteNombre implements AlgoritmosPacientes{
    
    public AlgoritmoPacienteNombre(){
        
    }
    @Override
    public ArrayList<Paciente> buscar(List<Paciente> pacientes,String nombre){
        boolean pertenece=true;
        ArrayList<Paciente> encontrados= new ArrayList<Paciente>();
        for(Paciente paciente:pacientes){
            for(int i=0;i<nombre.length();i++){
                pertenece=true;
                if(paciente.getNombre().charAt(i)!=nombre.charAt(i)){
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
