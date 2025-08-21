package org.example.ejercicioIntegrador;


public class Efectivo extends medioDePago {
    private final boolean esConsumidorFinal;

    public Efectivo(Fecha fecha, boolean esConsumidorFinal) {
        super(fecha);
        this.esConsumidorFinal = esConsumidorFinal;
    }

    public boolean isConsumidorFinal() { return esConsumidorFinal; }

    @Override
    public double precioFinal(double precioBruto, Fecha fechaCompra) {
        double descuento = esConsumidorFinal ? 0.15 : 0.10;
        return precioBruto * (1 - descuento);
    }

}
