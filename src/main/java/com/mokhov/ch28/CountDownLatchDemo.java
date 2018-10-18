package main.java.com.mokhov.ch28;

import java.util.concurrent.CountDownLatch;

class MyThread implements Runnable{

    CountDownLatch countDownLatch;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8 ; i++) {
            System.out.println(i);
            countDownLatch.countDown();
        }
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) {
        System.out.println("Starting");
        CountDownLatch countDownLatch =new CountDownLatch(5);
        MyThread myThread = new MyThread(countDownLatch);
        new Thread(myThread).start();

        try{
            countDownLatch.await();
        }catch (InterruptedException e){
            e.getMessage();
        }
        System.out.println("Done");
    }
}
