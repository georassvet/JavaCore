package main.thinkingInJava.collections;

import java.util.HashSet;
import java.util.Random;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hashSet =new HashSet<>();
        Random random =new Random(47);
        for (int i = 0; i < 200 ; i++) {
            hashSet.add(random.nextInt(30));
            System.out.println("size "+hashSet.size() + hashSet);
        }


    }
}
