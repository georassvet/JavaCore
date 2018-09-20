package main.myunderstanding;

import java.util.Iterator;

public class TestIterable implements Iterable<String> {
    private String[] strings =new String[10];

    public static void main(String[] args) {
        for (String s: new TestIterable()
             ) {
            System.out.println(s);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }
            @Override
            public String next() {
                return null;
            }
        };
    }
}
