package org.example.ejercicioIntegrador;

public class Producto {
    private final String id;
    private final double precio;

    public Producto(String id, double precio){
        this.id = id;
        this.precio =precio;

    }
    public String getId(){return id;}
    public double getPrecio(){return precio;}
}
