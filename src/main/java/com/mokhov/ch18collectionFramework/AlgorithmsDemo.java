package main.java.com.mokhov.ch18collectionFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {

        LinkedList<Double> linkedList = new LinkedList<>();

        linkedList.add(10.50);
        linkedList.add(11.50);
        linkedList.add(12.50);
        linkedList.add(15.50);
        linkedList.add(10.50);
        linkedList.add(9.50);
        linkedList.add(2.50);

        System.out.println(linkedList);

        Comparator<Double> comparator = Collections.reverseOrder();

        Collections.sort(linkedList,comparator);

        System.out.println(linkedList);

        Collections.shuffle(linkedList);

        System.out.println(linkedList);

        System.out.println("min "+Collections.min(linkedList)+" max "+Collections.max(linkedList));

    }
}
