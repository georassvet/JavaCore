package main.java.com.mokhov.ch15;

public class ReverseString {
    public static void main(String[] args) {
        StringChanger stringChanger = (val -> {
            String reverse = "";
            for (int i = val.length()-1; i >= 0 ; i--) {
                reverse+=val.charAt(i);
            }
            return reverse;
        }
        );

        System.out.println(stringChanger.change("Мама мыла раму"));

    }
}
interface StringChanger{
    String change(String val);
}
