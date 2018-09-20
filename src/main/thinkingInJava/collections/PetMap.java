package main.thinkingInJava.collections;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
    public static void main(String[] args) {
        Map<String,Pet> petMap =new HashMap<>();
        petMap.put("My Hamster", new Hamster("Хомка"));
        petMap.put("My Dog", new Dog("Боня"));

        Pet pet = petMap.get("My Hamster");
        System.out.println(pet);
        System.out.println(petMap.containsKey("My hamster"));
        System.out.println(petMap.containsValue(new Dog("Боня")));
        System.out.println(petMap.containsValue(new Dog("Шарик")));
        System.out.println(petMap.containsValue(pet));





    }
}
