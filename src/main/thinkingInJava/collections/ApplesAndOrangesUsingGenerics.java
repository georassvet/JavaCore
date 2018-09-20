package main.thinkingInJava.collections;

import java.util.ArrayList;

public class ApplesAndOrangesUsingGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples =new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            apples.add(new Apple());
        }
        // apples.add(new Orange()); List is generic with type Apple

        for (int i = 0; i < apples.size() ; i++) {
            System.out.println("Apple #"+apples.get(i).id());
        }


    }
}
