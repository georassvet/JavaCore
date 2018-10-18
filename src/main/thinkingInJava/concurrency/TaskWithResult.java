package main.thinkingInJava.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id){
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "Task with result "+id;
    }
}
class TaskWithResultDemo{
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<String>> list =new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            list.add(service.submit(new TaskWithResult(i)));
        }
        System.out.println("List");
        for (Future<String> future: list
             ) {
            try {
                System.out.println(future.get());
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }catch (ExecutionException e){
                System.out.println(e.getMessage());
            }
        }
        service.shutdown();
    }
}
