package main.thinkingInJava.collections;

import java.util.*;

public class SortedSetEx {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "Нашей стране нужен прорыв в технологической сфере и в общественной тоже".split(" "));
        System.out.println(sortedSet);

        String low = sortedSet.first();
        String high = sortedSet.last();

        System.out.println(low);
        System.out.println(high);

        Iterator<String> it = sortedSet.iterator();

        for (int i = 0; i <= 6; i++) {
            if (i == 3) { low= it.next(); }
            if (i == 6) { high=it.next(); }
            else it.next();
            }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedSet);
        System.out.println(sortedSet.subSet(low,high));
        System.out.println(sortedSet.headSet(low));
        System.out.println(sortedSet.tailSet(high));
    }
    }

