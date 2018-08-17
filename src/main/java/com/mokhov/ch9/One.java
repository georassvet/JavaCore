package main.java.com.mokhov.ch9;

public interface One {
    void method1();
    void method2();
}

interface Two extends One{
    void method3();
}
class TestExtendInterfaces implements  Two{
    public  void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }
    public void method3(){
        System.out.println("method 3");
    }

    public static void main(){
    Two test= new TestExtendInterfaces();
    test.method3();
    test.method2();
    test.method1();


    }
}