package main.thinkingInJava.concurrency;

import java.util.concurrent.*;

class FibonachiTask implements Callable<Integer>{

    private int k;
    FibonachiTask(int k){
        this.k=k;
    }

    public int fib(int x){
        if(x<2)return 1;
        else
            return fib(x-2)+fib(x-1);
    }
    public Integer call(){
        int result = 0;
        for (int i = 0; i < k ; i++) {
            result+=fib(k);
        }
        return result;
    }
}
public class FibonachiCallable {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 18; i++) {
                System.out.println(service.submit(new FibonachiTask(i)).get());
            }
        }catch (InterruptedException | ExecutionException e){
            System.out.println(e.getMessage());
        }
        service.shutdown();
    }
}
