package main.java.com.mokhov.ch28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser =new Phaser(1);
        int curPhase;
        System.out.println("Start");

        new Thread(new MyThreadPh(phaser,"A")).start();
        new Thread(new MyThreadPh(phaser,"B")).start();
        new Thread(new MyThreadPh(phaser,"C")).start();


        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        phaser.arriveAndDeregister();
        if(phaser.isTerminated()){
            System.out.println("The phaser is terminated");
        }
    }
}
class MyThreadPh implements Runnable{
    Phaser phaser;
    String name;

    public MyThreadPh(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("Thread "+ name + "phase one");
        phaser.arriveAndAwaitAdvance();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thread " + name + " phase two");
        phaser.arriveAndAwaitAdvance();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thread "+ name + " phase three");
        phaser.arriveAndAwaitAdvance();
    }
}
