package main.java.com.mokhov.ch4;

public class BoolLogic {
    public static void main(String[] args){
        boolean a = true, b=false, c;
        System.out.println("a|b "+(a|b));
        System.out.println("a&b "+(a&b));
        System.out.println("a^b "+(a^b)); // true
        System.out.println("(!a & b) |(a & !b) "+((!a & b)|(a & !b))); //true

    }
}
