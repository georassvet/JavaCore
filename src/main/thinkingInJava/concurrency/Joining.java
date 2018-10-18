package main.thinkingInJava.concurrency;

class Sleeper extends Thread{
    private int duration;

    public Sleeper(String name, int duration){
        super(name);
        this.duration=duration;
        start();
    }
    @Override
    public void run(){
        try {
            sleep(duration);
        }catch (InterruptedException e){
            System.out.println("Interrupted " + e.getMessage());
        }
        System.out.println(getName() + " awkward!");
    }
}
class Joiner extends Thread{
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper=sleeper;
        start();
    }
    @Override
    public void run(){
        try {
            sleeper.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(getName() + " is joined!");
    }
}
public class Joining {
    public static void main(String[] args) {
        Sleeper
                s1 = new Sleeper("SlepperOne", 4000),
                s2 = new Sleeper("SleeoerTwo", 2000);
        Joiner
                j1 = new Joiner("JoinerOne", s1),
                j2 = new Joiner("JoinerTwo", s2);
        s2.interrupt();
    }

}
