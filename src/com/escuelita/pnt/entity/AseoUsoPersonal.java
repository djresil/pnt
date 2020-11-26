package com.escuelita.pnt.entity;

public class AseoUsoPersonal extends Producto{

    public AseoUsoPersonal(String nombre, double presentación, int precio) {
        super(nombre, presentación, precio);
    }

    @Override
    public String toString() {
       return "Nombre: " + nombre + "  /// " + "Contenido: " + (int)presentación + "ml"+ " /// " + "Precio: " + precio;
    }
}
