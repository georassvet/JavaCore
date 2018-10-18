package main.thinkingInJava.concurrency;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

class SleepTask implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        Random random = new Random();
        int mil = random.nextInt(10000);
        try {
            TimeUnit.MILLISECONDS.sleep(mil);
        } catch (InterruptedException e){
            System.out.println( e.getMessage());
        }
        return Integer.toUnsignedLong(mil);
    }
}
public class TimeSleepingTask {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<Long>> list =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(service.submit(new SleepTask()));
        }
        try {
            for (Future<Long> f : list
                    ) {
                System.out.println(f.get());
            }
        }catch (InterruptedException | ExecutionException e){
            System.out.println(e.getMessage());
        }
        service.shutdown();
    }
}
