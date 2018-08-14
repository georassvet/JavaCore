package main.java.com.mokhov.ch7;

public class UseStatic {
    static int a=3;
    static int b;
    static void meth(int c){
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
    static {
        System.out.println("Static block initialized");
        b=a*4;
    }
    public static void main(String[] args){
        meth(10);
    }

}

