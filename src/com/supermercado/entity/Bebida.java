package com.supermercado.entity;

public class Bebida extends Producto{

    public Bebida(String nombre, int precio, double presentacion) {
        super(nombre, precio, presentacion);
    }


    @Override
    public String toString() {
        return    "Nombre: " + this.getNombre()
                + " /// " + " Litros=" + this.getPresentacion()
                +  " /// " + " Precio= $" + this.getPrecio() ;
    }


}
