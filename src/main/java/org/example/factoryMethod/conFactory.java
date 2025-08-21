package org.example.factoryMethod;

public class conFactory {
}


//Producto
interface Transport {void delivery();}
// Productos concretos
class camiones implements Transport{public void delivery(){ System.out.println("Delivery por tierra");}}
class barcos implements Transport{public void delivery(){ System.out.println("Delivery por mar");}}

//Fabrica: declara el factory method
abstract class Logistics {
    //factory
    protected abstract Transport createTransport();

    //Algoritmo que utiliza el producto abstracto
    public void planDeliver(){
        Transport t = createTransport();
        t.delivery();
    }
}
//Fábricas concretas
class tierraLogistics extends Logistics{
    @Override protected Transport createTransport(){return  new camiones();}
}
class marrLogistics extends Logistics{
    @Override protected Transport createTransport(){return new barcos();}
}
//Cliente
class Main{
    public static void main(String[]args){
        Logistics road = new tierraLogistics();
        Logistics sea  = new marrLogistics();

        road.planDeliver(); // usa Camion
        sea.planDeliver();  // usa Barco
    }
}