package main.java.com.mokhov.ch28;

class ChickenVoice implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Chicken!");
        }
    }
}
class EggVoice implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Egg!");
        }
    }
}


public class ChickenEggDemo {
    public static void main(String[] args) {
        new Thread(new EggVoice()).start();
        new Thread(new ChickenVoice()).start();
    }
}
