package main.java.com.mokhov.ch28;

public class DeadLockExample {

    private static class Friend{
        String name;
        Friend(String name){
            this.name = name;
        }
     synchronized void bow(Friend friend){
            System.out.println("Bow "+friend);
            friend.bowBack(this);
        }

       synchronized void bowBack(Friend friend){
            System.out.println("Bowback " + friend);
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main (String[] args) {
        Friend cup = new Friend("Mycup");
        Friend water =new Friend("clean water");

        new Thread(new Runnable() {
            @Override
            public void run() {
                cup.bow(water);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                water.bow(cup);
            }
        }).start();
    }
}
