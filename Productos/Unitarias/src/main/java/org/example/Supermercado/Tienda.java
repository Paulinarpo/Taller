package org.example.Supermercado;

public class Tienda extends SuperMercado{
    public String barrio;
    public Tienda(){}

    public Tienda(String nombre, String nit, Integer valorInventario, String barrio) {
        super(nombre, nit, valorInventario);
        this.barrio = barrio;
    }

    @Override
    public Double pagarCompra() {
        return null;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
