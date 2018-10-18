package main.thinkingInJava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyShared implements Runnable{
    private String song;
    private int counter = 0;

   public MyShared(String song , int counter){
        this.song =song;
        this.counter =counter;
    }

    void mymethod(){
        for (int i = 1; i < counter; i++) {
            song = song.substring(1,song.length())+song.charAt(0);
        }
        counter++;
        System.out.println(song);
   }

    public static void main(String[] args) {
       MyShared myShared = new MyShared("Hello world!", 10);
       myShared.mymethod();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            mymethod();
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Ex11 {
    public static void main(String[] args) {
        ExecutorService service =Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            service.execute(new MyShared("Космос ракета", 10));
        }
        service.shutdown();
    }
}
