package com.escuelita.pnt.controller;

import com.escuelita.pnt.entity.AseoUsoPersonal;
import com.escuelita.pnt.entity.Bebida;
import com.escuelita.pnt.entity.Fruta;
import com.escuelita.pnt.entity.Producto;

import java.util.ArrayList;
import java.util.List;


public class SuperMercBarrio {
   private List<Producto> productos = new ArrayList<>();

    public SuperMercBarrio() {


        agregarProductos();
        mostrarLista();
        System.out.println("=============================");
        System.out.println(masCaro());
        System.out.println(masBarato());

    }
    public void  agregarProductos(){
        Producto bebida = new Bebida("Coca-Cola Zero", 1.5, 20);
        Producto bebida2 = new Bebida("Coca-Cola", 1.5, 18);
        Producto shampoo = new AseoUsoPersonal("Shampoo Sedal", 500, 19);
        Producto fruta = new Fruta("Frutillas", 64, "kilo");

        productos.add(bebida);
        productos.add(bebida2);
        productos.add(shampoo);
        productos.add(fruta);

    }
    public void mostrarLista(){
        for (Producto producto : productos) {
            System.out.println(producto.toString());


        }
    }

    public String masCaro() {
        Producto preciMax;
        preciMax = productos.get(0);
        for(Producto producto: productos){
            if (producto.compareTo(preciMax)>0){
                preciMax = producto;
            }
        }

        return "Producto más caro: "+ preciMax.getNombre();
    }


    public String masBarato() {
       Producto precioMin;
        precioMin = productos.get(0);
        for(Producto producto: productos){
            if (producto.compareTo(precioMin)<0){
                precioMin = producto;
            }
        }

        return "Producto más barato: "+ precioMin.getNombre();
    }

}

