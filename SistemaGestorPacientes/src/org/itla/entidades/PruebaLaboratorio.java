package org.itla.entidades;

public class PruebaLaboratorio {
    //Atributos
    int codigo;
    String nombrePrueba;
    
    //Constructore
    public PruebaLaboratorio() {
    }

    public PruebaLaboratorio(int codigo, String nombrePrueba) {
        this.codigo = codigo;
        this.nombrePrueba = nombrePrueba;
    }
    
    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }
    
}
