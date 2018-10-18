package main.java.com.mokhov.ch11;

class Callme{
    void call(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    Callme target;
    String msg;
    Thread thread;

    Caller(Callme target, String msg){
        this.target = target;
        this.msg = msg;

        thread = new Thread(this);
    }
    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
public class WithoutSynchronizedDemo {
    public static void main(String[] args) {
        Callme callme =new Callme();

        Caller caller1 =new Caller(callme,"From caller1");
        Caller caller2 =new Caller(callme,"From caller2");
        Caller caller3 =new Caller(callme,"From caller3");

        caller1.thread.start();
        caller2.thread.start();
        caller3.thread.start();

        try{
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

}
