package main.java.com.mokhov.ch5;

public class DoWhile {
    public static void main(String[] args) {
        int i =10;

        do{
            System.out.println("tick "+i);
            i--;
        }while(i>0);
        i=10;
        do{
            System.out.println("new tick "+i);
        }while(--i > 0);

    }
}
