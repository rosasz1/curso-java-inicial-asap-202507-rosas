package org.example.ejercicioIntegrador;

public class Item {
    private final int cantidad;
    private final Producto producto;

    public Item(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }
    public int getCantidad(){return cantidad;}
    public Producto getProducto(){return producto;}

    public double subtotal(){
        return cantidad * producto.getPrecio();
    }
}
