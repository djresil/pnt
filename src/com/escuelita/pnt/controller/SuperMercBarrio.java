package com.escuelita.pnt.controller;

import com.escuelita.pnt.entity.AseoUsoPersonal;
import com.escuelita.pnt.entity.Bebida;
import com.escuelita.pnt.entity.Fruta;
import com.escuelita.pnt.entity.Producto;

import java.util.ArrayList;
import java.util.List;


public class SuperMercBarrio {
   private static List<Producto> productos = new ArrayList<>();
   
    public static void superMercBarrio() {


        agregarProductos();
        mostrarLista();
        System.out.println("=============================");
        masBarato();
        masCaro();


    }
    public static void  agregarProductos(){
        Producto bebida = new Bebida("Coca-Cola Zero", 1.5, 20);
        Producto bebida2 = new Bebida("Coca-Cola", 1.5, 18);
        Producto shampoo = new AseoUsoPersonal("Shampoo Sedal", 500, 19);
        Producto fruta = new Fruta("Frutillas", 64, "kilo");

        productos.add(bebida);
        productos.add(bebida2);
        productos.add(shampoo);
        productos.add(fruta);

    }
    public static void mostrarLista(){
        for (Producto producto : productos) {
            System.out.println(producto.toString());


        }
    }



    public static void masCaro(){
        productos.sort(Producto::compareTo);

        System.out.println( "Producto más caro: " + productos.get(productos.size()-1).getNombre());
    }

    public static void masBarato(){
        productos.sort(Producto::compareTo);

        System.out.println( "Producto más barato: " + productos.get(0).getNombre());
    }




}

