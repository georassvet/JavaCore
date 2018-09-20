package main.java.com.mokhov.ch10;

class MyException extends Exception{
    private int detail;

    MyException(int detail){
        this.detail =detail;
    }

    @Override
    public String toString() {
        return "MyException detail is " + detail;
    }
}
public class ExceptionDemo {

    static void compute(int a) throws MyException{
        System.out.println("start compute");
        if(a>10) {
            throw new MyException(a);
        }
        System.out.println("end compute");
    }
    public static void main(String[] args) {
        try {
            compute(2);
            compute(15);
        }catch (MyException ex){
            System.out.println(ex);
        }
    }
}
