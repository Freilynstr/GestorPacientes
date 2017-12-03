package org.itla.entidades;

public class ResultadoPrueba {
    //Atributos
    Paciente paciente;
    PruebaLaboratorio prueba;
    String resultado;
    
    //Constructores
    public ResultadoPrueba() {
    }

    public ResultadoPrueba(Paciente paciente, PruebaLaboratorio prueba, String resultado) {
        this.paciente = paciente;
        this.prueba = prueba;
        this.resultado = resultado;
    }
    
    //Getters y Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public PruebaLaboratorio getPrueba() {
        return prueba;
    }

    public void setPrueba(PruebaLaboratorio prueba) {
        this.prueba = prueba;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
