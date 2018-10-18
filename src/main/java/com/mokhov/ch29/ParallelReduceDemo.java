package main.java.com.mokhov.ch29;

import java.util.ArrayList;

public class ParallelReduceDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.2);
        list.add(5.1);
        list.add(6.1);
        list.add(1.3);
        list.add(2.4);

        Double d = list.parallelStream().reduce(1.0,(a,b) -> (a*Math.sqrt(b)),(a,b) -> a*b);
        System.out.format("|%-20.2f|",d);



    }
}
