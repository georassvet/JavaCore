package main.java.com.mokhov.ch29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamStartDemo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(8);
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(7);
        integerList.add(2);
        integerList.add(9);
        integerList.add(5);

        System.out.println(integerList);

        Optional<Integer> optInt =integerList.stream().max(Integer::compareTo);
        if(optInt.isPresent())
        System.out.println("max: "+ optInt.toString());
        optInt = integerList.stream().min(Integer::compareTo);
        if(optInt.isPresent())
        System.out.println("min: "+ optInt);

        Stream<Integer> sorted = integerList.stream().sorted(Integer::compareTo);
        sorted.forEach(x-> System.out.print(x+" "));

        System.out.println();
        Stream<Integer> filter1 = integerList.stream().sorted().filter(x->x%2==1)
                .filter(x->x>=5);
        filter1.forEach(x-> System.out.print(x+" "));










    }



}
