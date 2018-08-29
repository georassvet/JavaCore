package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque =new ArrayDeque<>();

        arrayDeque.add(10);
        arrayDeque.add(4);
        arrayDeque.add(5);
        arrayDeque.add(7);
        arrayDeque.add(11);
        arrayDeque.add(20);
        arrayDeque.add(1);

        while (arrayDeque.peek()!=null){
            System.out.print(arrayDeque.pop()+" ");
            System.out.println(arrayDeque);
        }
        System.out.println();

        System.out.println(arrayDeque);

    }
}
