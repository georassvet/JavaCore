package main.java.com.mokhov.ch18collectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A",2);
        map.put("C",2);
        map.put("F",2);
        map.put("D",2);
        map.put("B",2);

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for (Map.Entry<String,Integer> val : entrySet
             ) {
            System.out.println(val);
        }


    }
}
