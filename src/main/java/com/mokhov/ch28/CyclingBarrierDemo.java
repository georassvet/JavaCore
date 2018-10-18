package main.java.com.mokhov.ch28;


import java.util.concurrent.CyclicBarrier;

class  MyThreadB implements Runnable{
    String name;
    CyclicBarrier cyclicBarrier;

    public MyThreadB(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name =name;
    }
    @Override
    public void run() {
        System.out.println(name);
    try {
        cyclicBarrier.await();
    }catch (Exception e ){
        System.out.println(e.getMessage());
    }
        System.out.println("After await " + name);
    }
}

class BarrierAction implements Runnable{

    @Override
    public void run() {
        System.out.println("BarrierAction run");
    }
}

public class CyclingBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier =new CyclicBarrier(3, new BarrierAction());
        MyThreadB myThreadB1 = new MyThreadB(cyclicBarrier, "My thread 1");
        MyThreadB myThreadB2 = new MyThreadB(cyclicBarrier, "My thread 2");
        MyThreadB myThreadB3 = new MyThreadB(cyclicBarrier, "My thread 3");
        MyThreadB myThreadB4 = new MyThreadB(cyclicBarrier, "My thread 4");
        MyThreadB myThreadB5 = new MyThreadB(cyclicBarrier, "My thread 5");
        MyThreadB myThreadB6 = new MyThreadB(cyclicBarrier, "My thread 6");
        MyThreadB myThreadB7 = new MyThreadB(cyclicBarrier, "My thread 7");

        new Thread(myThreadB1).start();
        new Thread(myThreadB2).start();
        new Thread(myThreadB3).start();
        new Thread(myThreadB4).start();
        new Thread(myThreadB5).start();
        new Thread(myThreadB6).start();
        new Thread(myThreadB7).start();




    }
}
