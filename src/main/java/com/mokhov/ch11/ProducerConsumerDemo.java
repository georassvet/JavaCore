package main.java.com.mokhov.ch11;

class Q{
    int n;
    boolean valueSet = false;


    synchronized int get(){
        while (!valueSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet=false;
        notify();
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }
        return n;
    }

   synchronized void put(int n){
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
            this.n = n;
            valueSet =true;
            System.out.println("Put: " + n );
            notify();

       try {
           Thread.sleep(1000);
       }catch (InterruptedException e){
           System.out.println(e.getMessage());
       }
    }
}

class Producer implements Runnable{
    Thread thread;
    Q q;

    Producer(Q q){
        this.q=q;
        thread = new Thread(this, "Producer");
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Thread thread;
    Q q;

    Consumer(Q q){
        this.q=q;
        thread = new Thread(this, "Consumer");
    }

    @Override
    public void run() {

        while (true){
            q.get();
        }
    }
}


public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Q q =new Q();
        Producer producer =new Producer(q);
        Consumer consumer =new Consumer(q);

        producer.thread.start();
        consumer.thread.start();

    }
}
