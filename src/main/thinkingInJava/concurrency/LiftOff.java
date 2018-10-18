package main.thinkingInJava.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LiftOff implements Runnable  {
    private int count = 10;
    private static  int taskCount = 0;
    private final int id = taskCount++;

    public String display(int count){
        return String.format("#%d -> %d",id,count);
    }

    @Override
    public void run() {
        while (count-- > 0) {
            System.out.println(display(count));
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("LiftOff");
    }
}
class MainThread{
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5 ; i++) {
            executor.execute(new LiftOff());
        }
        ((ExecutorService) executor).shutdown();
    }
}
