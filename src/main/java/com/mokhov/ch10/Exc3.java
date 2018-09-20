package main.java.com.mokhov.ch10;

import java.util.Random;

public class Exc3 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random random =new Random();
        for (int i = 0; i < 1000 ; i++) {
            try{
                a=random.nextInt(100);
                b=random.nextInt(100);
                c=12345/(a/b);
            }catch (ArithmeticException ex){
                System.out.println("a=" + a + " b=" + b + " c=" + c);
                System.out.println(ex.getMessage());
                c=0;
            }
            System.out.println("c="+c);
        }

    }
}
