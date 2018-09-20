package main.thinkingInJava.collections;

import java.util.Arrays;

public class ArrayIsNotIterable {
    public static <T> void test(Iterable<T> iterable ){
        for ( T t:iterable
             ) {
            System.out.println(t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3,4,5));
        String[] strings ="Moscow never sleep".split(" ");
        test(Arrays.asList(strings));

    }

}
