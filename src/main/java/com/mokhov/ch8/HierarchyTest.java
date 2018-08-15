package main.java.com.mokhov.ch8;

class Computer{
    private String processor;
    private int ram;
    private int hard;
    private String hardType;
    Computer(){
        System.out.println("Computer constructor");
    }
    void show(){
        System.out.println("processor: "+processor
                +" ram: "+ram
                +" hardType: "+hardType
                +" hard: "+hard);
    }

}
class Laptop extends Computer{
    private boolean cdDisk;
    Laptop(){
        System.out.println("Laptop constructor");
    }
    void show(){
        super.show();
        System.out.println("cdDisk: " + cdDisk);
    }
}
class Ultrabook extends Laptop{
    private int height;
    Ultrabook(){
        System.out.println("Ultarbook constructor");
    }
    void show(){
        System.out.println("Ultrabook height: "+height);
    }
    void show(int price){
        System.out.println("Ultrabook height: "+height);
        System.out.println("price: " +price);
        System.out.println("super.show start");
        super.show();
        System.out.println("super.show end");
    }
}
class PC extends Computer{
    PC(){
        System.out.println("PC constructor");
    }
}
public class HierarchyTest {
    public static void main(String[] args) {
        Ultrabook ultrabook =new Ultrabook();
        PC pc =new PC();

        ultrabook.show();

        Laptop laptop =new Laptop();
        laptop.show();
        ultrabook.show(1000);

    }
}
