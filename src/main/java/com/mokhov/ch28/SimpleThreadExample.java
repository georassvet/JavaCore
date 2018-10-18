package main.java.com.mokhov.ch28;

public class SimpleThreadExample {

    static void threadMessage(String string){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " " + string);

    }

    private static class MessageLoop implements  Runnable{

        @Override
        public void run() {
            String[] messages = {
              "Can you tell me the Lost Luggage Office is, please?",
              "Don't worry! Be happy.",
              "My name is Ravi and I am Tess."
            };
            try {
                for (int i = 0; i < messages.length; i++) {
                    Thread.sleep(4000);
                    threadMessage(messages[i]);
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        threadMessage("Starting");
        Thread thread = new Thread(new MessageLoop());
        thread.start();
        long startTime = System.currentTimeMillis();
        while (thread.isAlive()){
            threadMessage("Still waiting");
            thread.join(1000);
            if(System.currentTimeMillis()-startTime > 1000*10 && thread.isAlive()){
                threadMessage("Tired of waiting");
                thread.interrupt();
                thread.join();
            }
        }
        threadMessage("Finally");
    }

}
