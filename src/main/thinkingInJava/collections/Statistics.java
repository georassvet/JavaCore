package main.thinkingInJava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Map<Integer,Integer> stats = new HashMap<>();
        Random random =new Random(47);

        for (int i = 0; i < 1000 ; i++) {
            int r =random.nextInt(30);
            Integer freq =stats.get(r);
            stats.put(r, freq==null? 1 : freq+1 );
        }
        System.out.println(stats);

        }

    }

