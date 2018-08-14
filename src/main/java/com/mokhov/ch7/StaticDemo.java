package main.java.com.mokhov.ch7;

public class StaticDemo {
     static  int a=10;
     static void callme(){
        System.out.println("a="+a);
    }
}
class  TestDotNotation{
    public static void main(String[] args){
        StaticDemo.callme();
    }
}
