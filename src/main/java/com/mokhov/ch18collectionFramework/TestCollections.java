package main.java.com.mokhov.ch18collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCollections {
    public static void main(String[] args) {
        createSet1(args);
        createSet2(args);
    }


    static void createSet2(String[] args) {
        Set<String> nonDups = Arrays.asList(args)
                .stream()
                .collect(Collectors.toSet());
        System.out.println(nonDups.size() + " distinct words" + nonDups);
    }
    static void createSet1(String[] args){
        Set<String> stringSet = new HashSet<>();
        for (String s : args
                ) {
            stringSet.add(s);
        }
        System.out.println(stringSet.size()+" distinct words"+stringSet);
    }
}
