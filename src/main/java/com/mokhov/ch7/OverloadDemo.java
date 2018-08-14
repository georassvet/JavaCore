package main.java.com.mokhov.ch7;

public class OverloadDemo {
    void test(){
        System.out.println("No parameters");
    }
//    void test(int a){
//        System.out.println("One parameter "+ a);
//    }
    void test(int a, int b){
        System.out.println("Two parameters "+a+" and "+ b);
    }
    double test(double d){
        return d;
    }
}
class Overload{
    public static void main(String[] args) {
        OverloadDemo overloadDemo =new OverloadDemo();
        overloadDemo.test();
        overloadDemo.test(4);
        overloadDemo.test(4,8);
        double result = overloadDemo.test(4.5);
        System.out.println(result);
    }
}
