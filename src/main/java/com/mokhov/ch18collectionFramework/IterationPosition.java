package main.java.com.mokhov.ch18collectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IterationPosition {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(95,96,97,98,99);
        ListIterator<Integer> listIterator = integerList.listIterator();

        System.out.println("Test list iterator");
        System.out.println();

        while (listIterator.hasNext()){
            System.out.println(".previousIndex() "+listIterator.previousIndex());
            System.out.println(" .nextIndex() "+listIterator.nextIndex());
            System.out.println(" .next() " + listIterator.next());

        }
        while (listIterator.hasPrevious()){
            System.out.println(".previousIndex() "+listIterator.previousIndex());
            System.out.println(" .nextIndex() "+listIterator.nextIndex());
            System.out.println(" .previous() " + listIterator.previous());
        }


    }
}
