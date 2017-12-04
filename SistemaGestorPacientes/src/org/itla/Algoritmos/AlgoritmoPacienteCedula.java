
package org.itla.Algoritmos;

import java.util.ArrayList;
import java.util.List;
import org.itla.Entidades.Paciente;

public class AlgoritmoPacienteCedula implements AlgoritmosPacientes{
    
    public AlgoritmoPacienteCedula(){
        
    }
    @Override
    public ArrayList<Paciente> buscar(List<Paciente> pacientes,String cedula){
        boolean pertenece=true;
        ArrayList<Paciente> encontrados= new ArrayList<>();
        for(Paciente paciente:pacientes){
            for(int i=0;i<cedula.length();i++){
                pertenece=true;
                if(paciente.getCedula().charAt(i)!=cedula.charAt(i)){
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
