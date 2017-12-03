package org.itla.Entidades;

import java.util.ArrayList;

public class Recetas {
    //Atributos
    Paciente paciente;
    Padecimiento padecimiento;
    ArrayList<String> Medicamentos = new ArrayList<>();
    
    //Constructores
    public Recetas() {
    }

    public Recetas(Paciente paciente, Padecimiento padecimiento) {
        this.paciente = paciente;
        this.padecimiento = padecimiento;
    }
    
    //Getters y Setters

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Padecimiento getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(Padecimiento padecimiento) {
        this.padecimiento = padecimiento;
    }

    public ArrayList<String> getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(ArrayList<String> Medicamentos) {
        this.Medicamentos = Medicamentos;
    }
    
    
}
