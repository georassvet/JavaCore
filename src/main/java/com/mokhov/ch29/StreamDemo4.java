package main.java.com.mokhov.ch29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers =new ArrayList<>();
        integers.add(10);
        integers.add(15);
        integers.add(23);
        integers.add(53);
        integers.add(33);
        integers.add(34);

        Stream<Double> newStream = integers.stream().map(Math::sqrt);

        Double result = newStream.reduce(1.0, (a,b)->a*b);

        System.out.println(result);



    }
}
