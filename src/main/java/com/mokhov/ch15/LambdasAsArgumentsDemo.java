package main.java.com.mokhov.ch15;


interface MyInterface{
    String proc(String s);
}

public class LambdasAsArgumentsDemo {

    public  static void method(MyInterface face, String s){
        System.out.println(face.proc(s));
    }

    public static void main(String[] args) {
        String string = "Hello world";

        method(((x)->{
            String s = "";
            for (int i = x.length()-1; i >= 0; i--) {
                s+=x.charAt(i);
            }
            return s;
        }),string);

        method(x->x.toUpperCase(),"Hello world!");
    }


}
