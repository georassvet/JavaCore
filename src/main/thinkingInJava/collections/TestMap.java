package main.thinkingInJava.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {

    static void test(Map<Integer,String> map){
        System.out.println("-----" + map.getClass().getName() + "-----");
        map.put(1,"Google");
        map.put(2,"Yandex");
        map.put(3,"Yahoo");
        map.put(4,"Bing");

        System.out.println("map.containsKey(2) " + map.containsKey(2));
        System.out.println("map.get(3) " + map.get(3));
        System.out.println("map.containsValue(Yandex)" + map.containsValue("Yandex"));
        System.out.println("values "+map.values());
        for(Integer i : map.keySet()){
            String val = map.get(i);
            System.out.print(i + " " + val+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        test(new HashMap<>());
        test(new TreeMap<>());
        test(new LinkedHashMap<>());
        test(new WeakHashMap<>());
        test(new ConcurrentHashMap<>());
        test(new IdentityHashMap<>());


    }

}
