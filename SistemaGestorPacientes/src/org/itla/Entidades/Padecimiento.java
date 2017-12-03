package org.itla.Entidades;

public class Padecimiento {
    //Atributos
    int codigoPadecimiento;
    String nombrePadecimiento;
    
    //Constructores
    public Padecimiento() {
    }
    
    public Padecimiento(int codigoPadecimiento, String nombrePadecimiento) {
        this.codigoPadecimiento = codigoPadecimiento;
        this.nombrePadecimiento = nombrePadecimiento;
    }
    
    //Getters y Setters

    public int getCodigoPadecimiento() {
        return codigoPadecimiento;
    }

    public void setCodigoPadecimiento(int codigoPadecimiento) {
        this.codigoPadecimiento = codigoPadecimiento;
    }

    public String getNombrePadecimiento() {
        return nombrePadecimiento;
    }

    public void setNombrePadecimiento(String nombrePadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
    }
    
    

    
}
