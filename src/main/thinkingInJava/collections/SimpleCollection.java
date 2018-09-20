package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        for (Integer i: collection
             ) {
            System.out.println(i);
        }
        Set<String> set =new HashSet<>();
        for (int i = 0; i < 10 ; i++) {
            set.add("A"+i);
        }
        set.add("B"+2);
        set.add("A"+4);
        set.add("A"+1);

        for (String  i : set
             ) {
            System.out.println(i);
        }



    }
}
