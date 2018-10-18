package main.thinkingInJava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class IntGenerator {
    private volatile  boolean canceled = false;
    public abstract int next();
    public void cancel(){ canceled = true;}
    public boolean isCanceled(){return canceled;}
}

class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id){
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while(!generator.isCanceled()){
            int val = generator.next();
            if(val%2!=0){
                System.out.println("====================="+val);
                generator.cancel();
            }
            System.out.println(val);
        }
    }

    public static void test(IntGenerator gp, int count){
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count ; i++) {
            exec.execute(new EvenChecker(gp, i));
        }
        exec.shutdown();
    }
    public static void test(IntGenerator gp){
        test(gp, 10);
    }
}
class EvenGenerator extends IntGenerator{

    private int currentEvenValue=0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
class SynchronizedEvenGenerator extends IntGenerator{

    private int currentEvanValue=0;

    @Override
    synchronized public int next() {
        ++currentEvanValue;
        Thread.yield();
        ++currentEvanValue;
        System.out.println(currentEvanValue);
        return currentEvanValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
        try {
            System.in.read();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
