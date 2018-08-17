package main.java.com.mokhov.ch9;

public class HashCode {
    public static void main(String[] args) {
        Object object =new Object();
        int hashCode = object.hashCode();
        System.out.println(hashCode);

        object =new Object();
        hashCode = object.hashCode();
        System.out.println(hashCode);
    }
}
