package main.java.com.mokhov.ch5;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("tick " + i++);
        }

        while (i > 0) {
            System.out.println("tick " + i--);
        }
    }
}
