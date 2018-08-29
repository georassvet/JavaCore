package main.java.com.mokhov.ch18collectionFramework;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> plants = new TreeSet<>();
        plants.add("Морковь");
        plants.add("Капуста");
        plants.add("Картошка");
        plants.add("Свекла");
        plants.add("Арбуз");
        plants.add("Тыква");
        plants.add("Дыня");

        System.out.println(plants);
        System.out.println(plants.subSet("Капуста","Свекла"));
        //System.out.println(subPlants);


    }
}
