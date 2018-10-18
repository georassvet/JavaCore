package main.java.com.mokhov.ch11;


class NewThread implements Runnable {
     Thread thread;

    public NewThread(String name){
        thread = new Thread(this,"Demo thread");
        System.out.println("Child thread " + thread );
    }
    @Override
    public void run() {
     try{
         for (int i = 5; i >=0 ; i--) {
             System.out.println(i);
             Thread.sleep(500);
         }
     }catch (InterruptedException e){
         System.out.println(e.getMessage());
     }
    }

    public Thread getThread() {
        return thread;
    }
}
public class NewThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread("Main");
        newThread.getThread().start();
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main exit");
    }
}
