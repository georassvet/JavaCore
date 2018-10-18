package main.java.com.mokhov.ch28;


import java.util.concurrent.Semaphore;

class ShipGenerator{

}


class Pier implements  Runnable{
    int id;
    Semaphore semaphore;

    public Pier(int id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

    }
}
class Ship implements Runnable{

    int id;
    Semaphore semaphore;

    public Ship(int id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

    }
}

public class ShipPierDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

    }
}
