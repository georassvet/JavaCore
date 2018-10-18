package main.java.com.mokhov.ch11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);

        thread.setName("My super thread");

        System.out.println(thread);

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("thread sleep");
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
