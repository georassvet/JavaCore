package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(10);

        System.out.println(coins);

        Integer[] arr = new Integer[coins.size()];
        arr=coins.toArray(arr);
        int sum=0;
        for (Integer a:arr
             ) {
            sum+=a;
        }
        System.out.println("sum "+sum);
    }
}
