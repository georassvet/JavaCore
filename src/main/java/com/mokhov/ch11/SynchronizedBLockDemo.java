package main.java.com.mokhov.ch11;

class Callme2{
    public void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("]");
    }
}
class Caller2 implements Runnable{
    Thread thread;
    Callme2 target;
    String msg;

    public Caller2(Callme2 target, String msg) {
        this.target = target;
        this.msg = msg;
        thread =new Thread(this);
    }
    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

public class SynchronizedBLockDemo {
    public static void main(String[] args) {
        Callme2 callme =new Callme2();
        Caller2 caller1 =new Caller2(callme,"From caller1");
        Caller2 caller2 =new Caller2(callme,"From caller2");
        Caller2 caller3 =new Caller2(callme,"From caller3");
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
