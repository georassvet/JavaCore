package main.thinkingInJava.collections;

import java.util.*;

class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class MapOfList {
    public static Map<Person,List<? extends Pet>> personListMap = new HashMap<>();
    static {
        personListMap.put(new Person("Sergey Grigoriev"),
                Arrays.asList(
                        new Hamster("Rolf"),
                        new Parrot("Кеша"),
                        new Dog("Bon")
                )
        );
        personListMap.put(new Person("Ilya Varlamov"),
                Arrays.asList(
                        new Cat("Murka")
                )
        );
    }

    public static void main(String[] args) {
        Set<Person> personSet = personListMap.keySet();
        System.out.println("personSet "+personSet);

        Collection<List<? extends Pet>> list =personListMap.values();
        for (List<? extends Pet> p: list
             ) {
            System.out.println(p);

        }
    }
}
