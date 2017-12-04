package org.itla.Entidades;

public class Medico extends Usuario{
   //Atributos 
   Especialidad especialidad;
   
   //Constructores

    public Medico(int codigoEmpleado, String nombre, String apellido, String telefonos, String direccion, String cedula, String tipo,Especialidad especialidad) {
        super(codigoEmpleado, nombre, apellido, telefonos, direccion, cedula, tipo);
        this.especialidad = especialidad;
    }

    public Medico() {
    }
    
    public Medico(String nombre,String especialidad){
        super();
        super.setNombre(nombre);
        this.especialidad=new Especialidad();
        this.especialidad.setNombre(especialidad);
    }
    
    //Getter y Setter
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
   
   
}
