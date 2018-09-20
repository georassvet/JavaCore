package main.java.com.mokhov.ch18collectionFramework;

import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>((a,b)->b.compareTo(a));
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers);

    }
}
