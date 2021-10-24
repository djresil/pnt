package com.supermercado;

import com.supermercado.entity.AseoUsoPersonal;
import com.supermercado.entity.Bebida;
import com.supermercado.entity.Fruta;
import com.supermercado.entity.Producto;


public class Main {

    public static void main(String[] args) {

      iniciarApp();
       

    }

    public static void cargarDatos(){
        Bebida bebida = new Bebida("Coca-Cola Zero", 20, 1.5);
        Bebida bebida2 = new Bebida("Coca-Cola", 18, 1.5);
        AseoUsoPersonal shampoo = new AseoUsoPersonal("Shampoo Sedal", 19, 500);
        Producto fruta = new Fruta("Frutillas", 64, "kilo");
        bebida.addProductosList(bebida);
        bebida2.addProductosList(bebida2);
        shampoo.addProductosList(shampoo);
        fruta.addProductosList(fruta);



    }

    public static void iniciarApp(){
        cargarDatos();
        Producto p = new Producto();
        p.mostrarLista();
        System.out.println("=============================");
        p.masCaro();
        p.masBarato();
    }


}
