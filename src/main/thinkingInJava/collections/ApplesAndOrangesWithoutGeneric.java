package main.thinkingInJava.collections;

import java.util.ArrayList;

class Apple{
    private static int counter;
    private final long id = counter++;
    public long id(){ return id; }
}
class Orange{

}

public class ApplesAndOrangesWithoutGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            apples.add(new Orange());
        }
        for (int i = 0; i <apples.size() ; i++) {
            Apple apple = (Apple) apples.get(i);
            System.out.println(apple.id());
        }
    }
}
