package main.java.com.mokhov.ch18collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}



public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> languges = new TreeSet<>(new MyComp());

        languges.add("C#");
        languges.add("Java");
        languges.add("Python");
        languges.add("PHP");
        languges.add("JavaScript");
        languges.add("C++");
        languges.add("C");
        languges.add("Kotlin");

        System.out.println(languges);

        TreeSet<String> languges1 =new TreeSet<>((new MyComp()).reversed());
        languges1.addAll(languges);

        System.out.println(languges1);

    }
}
