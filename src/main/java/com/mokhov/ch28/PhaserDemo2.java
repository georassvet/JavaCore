package main.java.com.mokhov.ch28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser{
    int numPhases;

    public MyPhaser(int parties, int phaseCount) {
        super(parties);
        this.numPhases = numPhases;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Phase " + phase + "completed.\n" );

        if(phase==numPhases || registeredParties == 0)
            return true;
        else
            return false;
    }
}

class MyThreadPhaser implements Runnable{

    Phaser phaser;
    String name;

    MyThreadPhaser(Phaser p, String n){
        this.phaser = p;
        this.name = n;
        this.phaser.register();
    }
    @Override
    public void run() {
     while(!phaser.isTerminated()){
         System.out.println("Thread " + name + " Beginning phase" + phaser.getPhase());
         phaser.arriveAndAwaitAdvance();
         try{
             Thread.sleep(100);
         }catch (InterruptedException e){
             System.out.println(e);
         }
     }
    }
}



public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser =new MyPhaser(1,4);
        System.out.println("Start");

        new Thread(new MyThreadPhaser(phaser,"A")).start();
        new Thread(new MyThreadPhaser(phaser,"B")).start();
        new Thread(new MyThreadPhaser(phaser,"C")).start();

            while(!phaser.isTerminated()){
                phaser.arriveAndAwaitAdvance();
            }
        System.out.println("The Phaser is terminated");
    }
}
