package org.itla.Entidades;

public class Medico extends Usuario{
   //Atributos 
   Especialidad especialidad;
   
   //Constructores

    public Medico(Especialidad especialidad, int codigoEmpleado, String nombre, String apellido, String telefonos, String direccion, String cedula, String tipo, String clave) {
        super(codigoEmpleado, nombre, apellido, telefonos, direccion, cedula, tipo, clave);
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
    
   public String[] convertirAArray(){
       String[] datos=new String[2];
       datos[0]=this.nombre;
       datos[1]=this.especialidad.getNombre();
       return datos;
   }
   
}
