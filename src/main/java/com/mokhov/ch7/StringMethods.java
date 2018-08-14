package main.java.com.mokhov.ch7;

public class StringMethods {
    public static void main(String[] args) {
        String first = "Hello world!";
        String second = "Hello everyone";
        String third = "Hello world!";

        boolean eq1 = first.equals(second);
        boolean eq2 =first.equals(third);

        System.out.println(first.length());
        try {
            char ch =second.charAt(4);
            System.out.println(ch);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();


    }
}
