package main.java.com.mokhov.ch10;

public class ThrowDemo {

    static void meth(){
        try {
            throw new NullPointerException("New exception");
        }catch (NullPointerException ex){
            System.out.println("Method catch block: " + ex.getMessage());
            throw  ex;
        }
    }
    public static void main(String[] args) {
        try {
            meth();
        }catch (NullPointerException ex){
            System.out.println("Main block catch: "+ex.getMessage());

        }
    }
}
