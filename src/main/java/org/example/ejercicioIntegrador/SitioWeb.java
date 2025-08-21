package org.example.ejercicioIntegrador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SitioWeb {
    private final List<CarritoDeCompra> carritos = new ArrayList<>();

    public void agregarCarritoVendido(CarritoDeCompra carrito) {
        carritos.add(carrito);
    }

    public void mostrarPreciosDeCarritosVendidos() {
        for (CarritoDeCompra c : carritos) {
            System.out.println("Carrito " + c.getId() + " -> $" + c.precioFinal());
        }
    }

    // retorna el ID del carrito más caro (o null si no hay carritos)
    public String idDelCarritoMasCaro() {
        return carritos.stream()
                .max(Comparator.comparingDouble(CarritoDeCompra::precioFinal))
                .map(CarritoDeCompra::getId)
                .orElse(null);
    }

    // promedio de cuotas solo de carritos pagados con tarjeta de crédito
    public double nroCuotasPromedio() {
        int suma = 0;
        int cantidad = 0;

        for (CarritoDeCompra c : carritos) {
            if (c.getMedioDePago() instanceof TarjetaDeCredito tc) {
                suma += tc.getCuotas();
                cantidad++;
            }
        }
        return (cantidad == 0) ? 0.0 : (suma * 1.0) / cantidad;
    }
}
