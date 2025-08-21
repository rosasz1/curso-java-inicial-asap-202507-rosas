package org.example.Clase7;

public class Circuito {
    private int tiempoSegundos;
    private int faltas;

    public Circuito(int tiempoSegundos, int faltas) {
        this.tiempoSegundos = tiempoSegundos;
        this.faltas = faltas;
    }

    public boolean aprobo() {
        return faltas <= 2;
    }

    public int getTiempoSegundos() {
        return tiempoSegundos;
    }
}
