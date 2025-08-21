package org.example.ejercicioIntegrador;


public class TransferenciaBancaria extends medioDePago {
    private final String cbu;

    public TransferenciaBancaria(Fecha fecha, String cbu) {
        super(fecha);
        this.cbu = cbu;
    }



    public String getCbu() { return cbu; }

    @Override
    public double precioFinal(double precioBruto, Fecha fechaCompra) {
        int dias = diasDesdeCompra(fechaCompra);
        double recargo = (dias > 10) ? 0.10 : 0.05;
        return precioBruto * (1 + recargo);
    }
}
