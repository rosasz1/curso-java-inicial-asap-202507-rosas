package org.example.Clase6;

import java.time.LocalDate;

public class EmpleadoSalarioFijo extends  Empleado{

    private double sueldoBasico;

    public EmpleadoSalarioFijo(int dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public EmpleadoSalarioFijo() {
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    private int calcularAniosAntiguedad(){
        int anioActual = LocalDate.now().getYear();
        return anioActual - this.getAnioIngreso();
    }

    @Override
    protected double calcularSalario() {
        int aniosAntiguedad = this.calcularAniosAntiguedad();
        if (this.calcularAniosAntiguedad() < 2){
            return this.sueldoBasico;
        } else if (aniosAntiguedad >= 2 && aniosAntiguedad <= 5) {
            return this.sueldoBasico * 0.05;
        } else if (aniosAntiguedad >= 6 && aniosAntiguedad <= 10) {
            return this.sueldoBasico * 0.10;
        }else{
            return this.sueldoBasico * 0.15;
        }
    }

}
