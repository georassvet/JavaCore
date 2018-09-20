package main.java.com.mokhov.ch10;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;

        try {
            a = 0;
            d=42/a;
            System.out.println("This will not be printed");
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Last statement");
    }
}
