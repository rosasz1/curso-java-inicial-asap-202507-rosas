package org.example.Clase7;

import java.util.ArrayList;
import java.util.List;

public class ExamenDeMoto extends Examen {
    private Moto moto;
    private List<Circuito> circuitos;

    public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
        super(fecha, persona);
        this.moto = moto;
        this.circuitos = new ArrayList<>();
    }

    public void agregarCircuito(Circuito c) {
        circuitos.add(c);
    }

    @Override
    public boolean aprobo() {
        int cilindrada = moto.getCilindrada();
        int totalTiempo = getTiempoTotal();
        long desaprobados = circuitos.stream().filter(c -> !c.aprobo()).count();

        if (cilindrada > 150) {
            return desaprobados == 0;
        } else {
            return desaprobados <= 1 && totalTiempo <= 120;
        }
    }

    @Override
    public int getTiempoTotal() {
        return circuitos.stream().mapToInt(Circuito::getTiempoSegundos).sum();
    }
}
