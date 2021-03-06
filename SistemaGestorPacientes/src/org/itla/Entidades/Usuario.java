package org.itla.Entidades;

public class Usuario {
    
    //Atributos
    int codigoEmpleado;
    String nombre;
    String apellido;
    String telefonos;
    String direccion;
    String cedula;
    String tipo;
    String clave;
    
    //Constructores

    public Usuario() {
    }
    
    public Usuario(int codigoEmpleado, String nombre, String tipo){
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Usuario(int codigoEmpleado, String nombre, String apellido, String telefonos, String direccion, String cedula, String tipo, String clave) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = telefonos;
        this.direccion = direccion;
        this.cedula = cedula;
        this.tipo = tipo;
        this.clave = clave;
    }
    
    //Getters y Setters

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    

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

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
