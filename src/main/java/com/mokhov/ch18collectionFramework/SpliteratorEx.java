package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorEx {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();

        nums.add(0.3);
        nums.add(1.03);
        nums.add(4.1);
        nums.add(8.2);
        nums.add(7.9);

        Spliterator<Double> spliterator =nums.spliterator();
        while (spliterator.tryAdvance(n-> System.out.println(n)));
        System.out.println();
        ArrayList<Double> sqrts =new ArrayList<>();
        spliterator=nums.spliterator();
        while (spliterator.tryAdvance(n->sqrts.add(n*n)));

        spliterator=sqrts.spliterator();
        spliterator.forEachRemaining((n)-> System.out.println(n));




    }
}
