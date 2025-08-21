package org.example.Clase6;

public class EmpleadoAComision extends Empleado{

    private final double SALARIO_MINIMO = 20000;
    private int clientesCaptados;
    private double montoPorCliente;


    public EmpleadoAComision(int dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public EmpleadoAComision() {
    }



    public double getSALARIO_MINIMO() {
        return SALARIO_MINIMO;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    protected double calcularSalario() {
        double salario = this.clientesCaptados * this.montoPorCliente;
        if(salario > this.SALARIO_MINIMO){
            return salario;
        }else{
            return this.SALARIO_MINIMO;
        }
        //forma corta, compara ambos valores y devuelve el mayor
        // return Math.max(salario, this.SALARIO_MINIMO);
    }



}
