package main.thinkingInJava.concurrency;

import java.util.Random;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;


class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Random random = new Random();
        int priority;
        switch (random.nextInt(3)){
            case 1: priority = Thread.MAX_PRIORITY; break;
            case 2: priority = Thread.MIN_PRIORITY; break;
            default: priority = Thread.NORM_PRIORITY; break;
        }
        Thread thread =new Thread(r);
        thread.setPriority(priority);
        return thread;
    }
}

class SimplePriorityTask implements Runnable{

    @Override
    public void run(){

        for (int i = 0; i < 5; i++) {
            System.out.format("%d : %s : %d%n",i,Thread.currentThread().getName(), Thread.currentThread().getPriority());
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }

}
public class SimplePrioritiesDemo {
    public static void main(String[] args) {
        ThreadFactory threadFactory =new MyThreadFactory();
        for (int i = 0; i < 10 ; i++) {
            threadFactory.newThread(new SimplePriorityTask()).start();
        }
    }
}
