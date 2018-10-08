package main.java.com.mokhov.ch15;

interface GenIface<T>{
    T func(T t);
}

public class GenericFuncInt {
    public static void main(String[] args) {
        GenIface<Integer> integerGenIface = k -> {
            return k;
        };
        GenIface<String> stringGenIface = k -> {
            return k;
        };

        System.out.println(integerGenIface.func(100));
        System.out.println(stringGenIface.func("Hello world"));


    }
}
