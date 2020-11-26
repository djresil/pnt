package com.escuelita.pnt.entity;

public class Fruta extends Producto{

    private String unidadDeVenta;


    public Fruta() {
    }

    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super(nombre , precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "  /// " + "Precio: " + precio + "  /// " + "Unidad de venta: " + unidadDeVenta;
    }
}
