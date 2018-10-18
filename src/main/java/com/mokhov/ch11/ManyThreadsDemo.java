package main.java.com.mokhov.ch11;

class NewThread3 implements Runnable{

    private Thread thread;

    public NewThread3(String name){
        thread=new Thread(this,name);
        System.out.println(thread);
    }
    @Override
    public void run(){
        try {
            for (int i = 5; i >= 0; i--) {
                Thread.sleep(1000);
                System.out.println(this +" "+i);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(this+" exit");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public String toString() {
        return thread.getName();
    }
}
public class ManyThreadsDemo {
    public static void main(String[] args) {
        NewThread3 thread1 = new NewThread3("Thread1");
        NewThread3 thread2 = new NewThread3("Thread2");
        NewThread3 thread3 = new NewThread3("Thread3");

        thread1.getThread().start();
        thread2.getThread().start();
        thread3.getThread().start();
try {
    for (int i = 5; i >= 0; i--) {
         Thread.sleep(2000);
        System.out.println("Main Thread "+ i);
    }
}catch (InterruptedException e){
    System.out.println(e.getMessage());
}
        System.out.println("Main exit");

    }

}
