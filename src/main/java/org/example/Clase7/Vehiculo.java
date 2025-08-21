package org.example.Clase7;

public abstract class Vehiculo {
    protected String patente;
    protected String marca;
    protected int cilindrada;

    public Vehiculo(String patente, String marca, int cilindrada){
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
       public int getCilindrada(){
        return cilindrada;
       }

}
