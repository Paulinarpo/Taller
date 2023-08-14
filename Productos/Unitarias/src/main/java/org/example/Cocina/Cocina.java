package org.example.Cocina;

public class Cocina {
    private String nombre;
    private Integer costoCena;
    private Boolean aceptaDomicilio;

    public Cocina() {
    }

    public Cocina(String nombre, Integer costoCena, Boolean aceptaDomicilio) {
        this.nombre = nombre;
        this.costoCena = costoCena;
        this.aceptaDomicilio = aceptaDomicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCostoCena() {
        return costoCena;
    }

    public void setCostoCena(Integer costoCena) {
        this.costoCena = costoCena;
    }

    public Boolean getAceptaDomicilio() {
        return aceptaDomicilio;
    }

    public void setAceptaDomicilio(Boolean aceptaDomicilio) {
        this.aceptaDomicilio = aceptaDomicilio;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "nombre='" + nombre + '\'' +
                ", costoCena=" + costoCena +
                ", aceptaDomicilio=" + aceptaDomicilio +
                '}';
    }
}
