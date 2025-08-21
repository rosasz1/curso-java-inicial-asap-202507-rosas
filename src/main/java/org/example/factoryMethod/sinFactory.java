package org.example.factoryMethod;

public class sinFactory {
}

//Productos concretos
interface Transporte {void delivery();}
class camion implements Transporte{public void delivery(){ System.out.println("Delivery por tierra");}}
class barco implements Transporte{public void delivery(){ System.out.println("Delivery por mar");}}


//Cliente acoplado a clases concretas
class logistcApp{

    //decide y crea aca mismo, if/else para cada variante

    static void planDelivery(String tipo){
        Transporte t;
        if (tipo.equals("tierra")){
            t = new camion();
        } else if (tipo.equals("mar")) {
            t = new barco();

        }else {
            throw new IllegalArgumentException("Tipo desconocido");
        }
        t.delivery();
    }
    public static void main (String[] args) {
        planDelivery("tierra");
        planDelivery("mar");
    }
}