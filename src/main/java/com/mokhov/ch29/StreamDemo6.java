package main.java.com.mokhov.ch29;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.8);
        doubleList.add(4.8);
        doubleList.add(5.8);
        doubleList.add(3.8);
        doubleList.add(0.8);

        doubleList.forEach(System.out::println);
        System.out.println();
        doubleList.stream().mapToInt(value -> (int)Math.ceil(value)).forEach(System.out::println);

    }
}
