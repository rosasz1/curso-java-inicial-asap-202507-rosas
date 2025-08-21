package org.example.Clase7;

public abstract class Examen {
    protected String fecha;
    protected Persona persona;

    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.persona = persona;
    }

    public abstract boolean aprobo();
    public abstract int getTiempoTotal();
}

