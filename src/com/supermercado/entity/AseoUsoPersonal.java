package com.supermercado.entity;

public class AseoUsoPersonal extends Producto{

    public AseoUsoPersonal(String nombre, int precio , double presentacion ) {
        super(nombre, precio, presentacion);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "  /// "
                + "Contenido: " + (int) this.getPresentacion() + "ml"
                + " /// " + "Precio: " + this.getPrecio();
    }
}
