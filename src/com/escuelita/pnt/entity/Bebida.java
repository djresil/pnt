package com.escuelita.pnt.entity;

public class Bebida extends Producto{

    public Bebida(String nombre, double presentación, int precio) {
        super(nombre, presentación, precio);
    }

    @Override
    public String toString() {
        return    "Nombre: " + nombre + " /// " + " Litros=" + presentación +  " /// " + " Precio= $" + precio ;
    }
}
