package main.thinkingInJava.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1 =new HashSet<>();
        Collections.addAll(set1,"A B C D E F H I J K L N O P Q R S T U V W X Y Z".split(" "));
        set1.add("H");
        System.out.println("contains(\"H\")" + set1.contains("H"));
        System.out.println("contains(\"G\")" + set1.contains("G"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2,"H I J K L".split(" "));
        System.out.println("set2 in set1 "+set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
