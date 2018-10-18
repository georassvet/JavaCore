package main.java.com.mokhov.ch11;

class NewThread2 extends Thread{

    NewThread2(String name){
        super(name);
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i >= 0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}


public class NewThreadDemo2 {
    public static void main(String[] args) {
        NewThread2 newThread2 =new NewThread2("Main Thread2");
        newThread2.start();

        for (int i = 5; i >=0 ; i--) {
            try {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }

    }
}
