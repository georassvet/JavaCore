package main.java.com.mokhov.ch4;

public class Ternary {
    public static void main(String[] args) {
        int i,k;
        i=10;

        k=i<0? -i: i;
        System.out.println("1. k "+k);

        i=-10;
        k=i>0?i:-i;

        System.out.println("2. k "+k);

    }

}
