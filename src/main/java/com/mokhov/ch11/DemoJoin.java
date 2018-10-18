package main.java.com.mokhov.ch11;

class NewThread4 implements Runnable{
    Thread thread;
    String name;

    NewThread4(String name){
        this.name=name;
        thread =new Thread(this,name);
        System.out.println(thread);
    }

    @Override
    public void run(){
                try{
                    for (int i = 5; i >= 0 ; i--) {
                        Thread.sleep(500);
                        System.out.println(name + " " +i );
                    }
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
        System.out.println(thread + " exit");
    }
}

public class DemoJoin {
    public static void main(String[] args){
        NewThread4 newThread1 =new NewThread4("New Thread 1");
        NewThread4 newThread2 =new NewThread4("New Thread 2");
        NewThread4 newThread3 =new NewThread4("New Thread 3");

        newThread1.thread.start();
        newThread2.thread.start();
        newThread3.thread.start();

        System.out.println("newThread1 "+newThread1.thread.isAlive());
        System.out.println("newThread2 "+newThread2.thread.isAlive());
        System.out.println("newThread3 "+newThread3.thread.isAlive());

        try{
            System.out.println("start join");
            newThread1.thread.join();
            newThread2.thread.join();
            newThread3.thread.join();
            System.out.println("end join");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("newThread1 "+newThread1.thread.isAlive());
        System.out.println("newThread2 "+newThread2.thread.isAlive());
        System.out.println("newThread3 "+newThread3.thread.isAlive());

        System.out.println("Main thread exiting");
    }

}
