package main.java.com.mokhov.ch8;

public class Shipment extends BoxWeight {
    private double cost;

    Shipment(double cost, double weight, double height, double width, double depth){
        super(weight,height,width,depth);
        this.cost=cost;
    }
    Shipment(Shipment shipment){
        super(shipment);
        this.cost=shipment.cost;
    }
    Shipment(){
        super();
        this.cost=-1;
    }
    Shipment(double cost, double width, double weight){
        super(weight,width);
        this.cost=cost;
    }

}

class ShipmentDemo{
    public static void main(String[] args) {
        Shipment shipment1 =new Shipment();
        Shipment shipment2 =new Shipment(100.0,20.5,25,10,10);
        Shipment shipment3 =new Shipment(shipment2);
        Shipment shipment4 =new Shipment(150.0,50,100);

        System.out.println(shipment1.getVolume());
        System.out.println(shipment2.getVolume());
        System.out.println(shipment3.getVolume());
        System.out.println(shipment4.getVolume());
    }
}