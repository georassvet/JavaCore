package main.thinkingInJava.collections;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    String[] strings ="Кто хочет играть в настольный теннис? Я спрашиваю кто?".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                if(index<strings.length)
                    return true;
                return false;
            }
            @Override
            public String next() {
                return strings[index++];
            }
        };
    }

    public static void main(String[] args) {
        for ( String s : new IterableClass()
             ) {
            System.out.print(s+" ");
        }

    }
}
