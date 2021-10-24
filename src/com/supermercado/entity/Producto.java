package com.supermercado.entity;

import java.util.ArrayList;
import java.util.List;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int precio;
    private double presentacion;
    private static List<Producto> productoList = new ArrayList<>();

    public Producto() {
    }
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, int precio, double presentacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.presentacion = presentacion;
    }

    public void addProductosList(Producto producto){
        productoList.add(producto);
    }
    public  void mostrarLista(){
        for (Producto producto : productoList)
        System.out.println(producto);
    }
    public  void masCaro(){
        productoList.sort(Producto::compareTo);

        System.out.println( "Producto más caro: " + productoList.get(productoList.size()-1).getNombre());
    }

   public  void masBarato(){
        productoList.sort(Producto::compareTo);

        System.out.println( "Producto más barato: " + productoList.get(0).getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public double getPresentacion() {
        return presentacion;
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
