package main.java.com.mokhov.ch11;



class MyThread5 implements Runnable{
    Thread t;
    boolean isSuspend;

    MyThread5(){
        t=new Thread(this);
        isSuspend=false;
    }

    @Override
    public void run() {
        try{
            for (int i = 15; i >0 ; i--) {
                System.out.println(t + " "+ i);
                Thread.sleep(200);
                synchronized (this){
                    while (isSuspend){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void suspend(){
        isSuspend = true;
    }
    public synchronized void resume(){
        isSuspend = false;
        notify();
    }

}

public class TestSuspend {
    public static void main(String[] args) {

        MyThread5 myThread1 =new MyThread5();
        MyThread5 myThread2 =new MyThread5();

        myThread1.t.start();
        myThread2.t.start();
        try {
            Thread.sleep(1000);
            myThread1.suspend();
            myThread2.suspend();
            System.out.println("Threads suspend");
            Thread.sleep(1000);
            myThread1.resume();
            Thread.sleep(1000);
            myThread2.resume();
            System.out.println("resuming two threads");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        try {
            myThread1.t.join();
            myThread2.t.join();
        }catch (InterruptedException e ){
            System.out.println(e.getMessage());
        }
        System.out.println("main thread exit");
    }

}
