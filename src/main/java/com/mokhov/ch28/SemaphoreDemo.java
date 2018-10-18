package main.java.com.mokhov.ch28;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore =new Semaphore(1);
        new Thread(new IncThread("IThread1",semaphore)).start();
        new Thread(new DecThread("DThread2",semaphore)).start();
        new Thread(new DecThread("DThread3",semaphore)).start();


    }
}
class Shared{
 static String string = "Hello world!";

 static void updateString(){
     String result="";
     for (int i = 1; i <= string.length()-1 ; i++) {
         result+=string.charAt(i);
     }
     result+=string.charAt(0);
     string = result;
 }
}
class IncThread implements Runnable{
    String name;
    Semaphore semaphore;

    public IncThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try{
            System.out.println("Get permits " + name);
            semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                Shared.updateString();
                System.out.println(name + " : " + Shared.string);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("release permit " + name);
        semaphore.release();
    }
}
class DecThread implements Runnable{
String name;
Semaphore semaphore;

    public DecThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try{
            System.out.println("Get permits " + name);
            semaphore.acquire();

            for (int i = 0; i < 5; i++) {
                Shared.updateString();
                System.out.println(name+ " : " + Shared.string);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("release permit");
        semaphore.release();

    }
}

