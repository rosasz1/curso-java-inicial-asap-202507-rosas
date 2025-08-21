package org.example.ejercicioIntegrador;


public abstract class medioDePago {
    protected final Fecha fecha;

    protected medioDePago(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() { return fecha; }

    // hook útil para subclases
    protected int diasDesdeCompra(Fecha fechaCompra) {
        return Fecha.diasTranscurridosEntreFechas(fechaCompra, this.fecha);
    }

    public abstract double precioFinal(double precioBruto, Fecha fechaCompra);
}


