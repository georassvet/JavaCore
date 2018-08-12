package main.java.com.mokhov.ch5;

public class BreakErr {
    public static void main(String[] args) {
        one: for (int i = 0; i <3 ; i++) {
            System.out.println("Some text");
        }
        for (int i = 0; i <4 ; i++) {
            if(i==3){
               // break one;
            }
        }
    }
}
