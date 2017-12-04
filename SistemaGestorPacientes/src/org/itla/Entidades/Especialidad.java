package org.itla.Entidades;

public class Especialidad {
    int codigoEspecialidad;
    String nombre;
    
    //Constructores
    public Especialidad(){
        
    }
    
    public Especialidad(int codigoEspecialidad, String nombre) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.nombre = nombre;
    }
    
    //Getters y Setters

    public int getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
