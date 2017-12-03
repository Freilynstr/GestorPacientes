package org.itla.entidades;

import javax.swing.ImageIcon;

public class Paciente {
    
    //Atributos
    String nombre;
    String apellido;
    String telefono;
    String direccion;
    String cedula;
    String fechaNacimiento;
    Boolean fumador;
    ImageIcon foto;

    //Constructores

    public Paciente(String nombre, String apellido, String telefono, String direccion, String cedula, String fechaNacimiento, Boolean fumador, ImageIcon foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.fumador = fumador;
        this.foto = foto;
    }

    public Paciente() {
    }


    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getFumador() {
        return fumador;
    }

    public void setFumador(Boolean fumador) {
        this.fumador = fumador;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
}
