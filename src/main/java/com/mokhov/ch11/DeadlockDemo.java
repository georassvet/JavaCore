package main.java.com.mokhov.ch11;

class A{
    synchronized void foo(B b){
    String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+" trying to call B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("Inside A.last");
    }
}
class B{
   synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+" trying to call A.last()");
        a.last();
    }
   synchronized void last(){
        System.out.println("Inside B.last");
    }
}

public class DeadlockDemo implements Runnable {
    Thread thread;
    A a = new A();
    B b =new B();

    public DeadlockDemo() {
        Thread.currentThread().setName("MainThread");
        thread =new Thread(this, "RacingThread");
    }
    void startDeadLock(){
        thread.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }
    public static void main(String[] args) {
        DeadlockDemo deadlockDemo =new DeadlockDemo();
        deadlockDemo.startDeadLock();
    }
    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in other thread");
    }
}
