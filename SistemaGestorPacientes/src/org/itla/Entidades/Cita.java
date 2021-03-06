package org.itla.Entidades;

public class Cita {
    Paciente paciente;
    String fecha;
    String hora;
    Medico medico;
    String causa;

    //Constructores

    public Cita() {
    }

    public Cita(Paciente paciente, String fecha, String hora, Medico medico, String causa) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.causa = causa;
    }

    //Getters and Setters

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    
}
