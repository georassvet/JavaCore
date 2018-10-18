package main.java.com.mokhov.ch28;

import java.util.concurrent.Semaphore;

class Q{
    int i;
    Semaphore semCon = new Semaphore(0);
    Semaphore semProd = new Semaphore(1);

    void get(){
        try {
            semCon.acquire();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Got " + this.i);
        semProd.release();
    }

    void put(int i){
        try {
            semProd.acquire();

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Put " + i);
        this.i = i;
        semCon.release();

    }

}
class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            q.put(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            q.get();
        }
    }
}

public class ProducerConsumerSemaphore {
    public static void main(String[] args) {
      Q q = new Q();
      Producer producer =new Producer(q);
      Consumer consumer =new Consumer(q);
      new Thread(producer).start();
      new Thread(consumer).start();
    }
}
