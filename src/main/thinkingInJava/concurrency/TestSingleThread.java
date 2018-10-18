package main.thinkingInJava.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class TestSingleThread {

    public static void main(String[] args) {
        ExecutorService service =  Executors.newCachedThreadPool();
        for (int i = 0; i < 3 ; i++) {
            service.execute(new MyTask());
        }
        service.shutdown();
    }
}
