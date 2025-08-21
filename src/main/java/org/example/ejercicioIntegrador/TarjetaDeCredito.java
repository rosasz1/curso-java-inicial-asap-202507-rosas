package org.example.ejercicioIntegrador;

public class TarjetaDeCredito extends medioDePago {
    private final int cuotas;

    public TarjetaDeCredito(Fecha fecha, int cuotas) {
        super(fecha);
        this.cuotas = cuotas;
    }

    public int getCuotas() { return cuotas; }

    @Override
    public double precioFinal(double precioBruto, Fecha fechaCompra) {
        // +15% por cada cuota
        return precioBruto * (1 + 0.15 * cuotas);
    }
}

