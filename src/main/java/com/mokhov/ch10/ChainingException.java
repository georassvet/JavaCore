package main.java.com.mokhov.ch10;

public class ChainingException {
    static void demoproc(){
        NullPointerException e =new NullPointerException("Null exception");

        e.initCause(new ArithmeticException("Arithmetic exception"));
        throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException ex){
            System.out.println(ex);
            System.out.println(ex.getCause());
            System.out.println("print stack");
          //  ex.printStackTrace();
        }
    }
}
