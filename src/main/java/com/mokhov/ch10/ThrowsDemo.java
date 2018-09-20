package main.java.com.mokhov.ch10;

public class ThrowsDemo {

    static void throwExMeth() throws IllegalAccessException{
     throw new IllegalAccessException("no access");
    }
    public static void main(String[] args) {
        try {
            throwExMeth();
        }catch (IllegalAccessException ex){
            System.out.println(ex.getMessage());
        }
    }
}
