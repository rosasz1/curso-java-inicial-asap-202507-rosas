package org.example.ejercicioIntegrador;

import java.util.List;


public class CarritoDeCompra {
    private final String id;
    private final List<Item> items;
    private final medioDePago medioDePago;
    private final Fecha fecha;

    public CarritoDeCompra(String id, List<Item> items, medioDePago medioDePago, Fecha fecha) {
        this.id = id;
        this.items = List.copyOf(items);
        this.medioDePago = medioDePago;
        this.fecha = fecha;
    }

    public String getId() { return id; }
    public List<Item> getItems() { return items; }
    public medioDePago getMedioDePago() { return medioDePago; }
    public Fecha getFecha() { return fecha; }

    public double precioBruto() {
        return items.stream().mapToDouble(Item::subtotal).sum();
    }

    public double precioFinal() {
        return medioDePago.precioFinal(precioBruto(), fecha);
    }
}
