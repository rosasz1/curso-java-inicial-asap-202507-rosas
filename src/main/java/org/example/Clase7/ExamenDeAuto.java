package org.example.Clase7;

public class ExamenDeAuto extends Examen {
    private Circuito circuito;
    private Auto auto;

    public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
        super(fecha, persona);
        this.circuito = circuito;
        this.auto = auto;
    }

    @Override
    public boolean aprobo() {
        return circuito.aprobo() && circuito.getTiempoSegundos() <= 90;
    }

    @Override
    public int getTiempoTotal() {
        return circuito.getTiempoSegundos();
    }
}
