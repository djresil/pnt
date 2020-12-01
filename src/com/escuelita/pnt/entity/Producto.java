package com.escuelita.pnt.entity;


import java.util.Objects;

public class Producto implements Comparable<Producto> {
    String nombre;
    double presentación;
    int precio;

    public Producto() {
    }


    public Producto(String nombre, double presentación, int precio) {
        this.nombre = nombre;
        this.presentación = presentación;
        this.precio = precio;
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresentación() {
        return presentación;
    }

    public void setPresentación(double presentación) {
        this.presentación = presentación;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.presentación, presentación) == 0 &&
                precio == producto.precio &&
                Objects.equals(nombre, producto.nombre);
    }


    public int hashCode() {
        return Objects.hash(nombre, presentación, precio);
    }


    @Override
    public int compareTo(Producto producto) {
        int result=0;
       if (this.getPrecio() > producto.getPrecio()){
           result = 1;
       }else if ( this.getPrecio() < producto.getPrecio()){
           result = -1;
       }
    return result;
    }
}
