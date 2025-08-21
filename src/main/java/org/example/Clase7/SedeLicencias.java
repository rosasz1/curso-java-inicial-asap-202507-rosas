package org.example.Clase7;

import java.util.*;
import com.google.gson.Gson;

public class SedeLicencias {
    private List<Examen> examenes;

    public SedeLicencias() {
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen e) {
        examenes.add(e);
    }

    public String obtenerInforme() {
        long reprobados = examenes.stream().filter(e -> !e.aprobo()).count();
        double porcReprobados = (reprobados * 100.0) / examenes.size();

        double promedioTiempoAutosAprobados = examenes.stream()
                .filter(e -> e instanceof ExamenDeAuto && e.aprobo())
                .mapToInt(Examen::getTiempoTotal)
                .average()
                .orElse(0.0);

        Map<String, Object> resultado = new LinkedHashMap<>();
        resultado.put("porcReprobados", porcReprobados);
        resultado.put("promTiempoAutosAprobados", promedioTiempoAutosAprobados);

        return new Gson().toJson(resultado);
    }
}

