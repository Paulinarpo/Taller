package org.example.Supermercado;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperMercado {
    protected String nombre;
    protected String nit;
    protected Integer valorInventario;

    protected List<String> productos=new ArrayList<>();

    public SuperMercado() {
    }

    public SuperMercado(String nombre, String nit, Integer valorInventario) {
        this.nombre = nombre;
        this.nit = nit;
        valorInventario= valorInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Integer getValorInventario() {
        return valorInventario;
    }

    public void setValorInventario(Integer valorInventario) {
        valorInventario = valorInventario;
    }

    @Override
    public String toString() {
        return "SuperMercado{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", ValorInventario=" + valorInventario +
                '}';
    }
    public void   mostarInventario(){
        this.productos.add("Arroz");
        this.productos.add("Papas");
        System.out.println();
    }
    public abstract Double pagarCompra() throws Exception;
}
