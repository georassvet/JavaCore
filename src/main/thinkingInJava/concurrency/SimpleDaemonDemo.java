package main.thinkingInJava.concurrency;


import java.util.concurrent.TimeUnit;

class SimpleDaemon implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(50);
                System.out.println("Daemon " + this);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}


public class SimpleDaemonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            Thread thread = new Thread(new SimpleDaemon());
            thread.setDaemon(true);
            thread.start();
        }
        try {
            System.out.println("wait 200");
            TimeUnit.MILLISECONDS.sleep(50);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
