package main.java.com.mokhov.ch18collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class FindDups {
    public static void main(String[] args) {

        String[] cars = new String []{"BMW","VOLKSWAGEN","LADA","NIVA","BMW","MERCEDES","UAZ","BMW","LADA"};

        Set<String> uniques = new HashSet<>();
        Set<String> dups = new HashSet<>();

        for (String s:cars
             ) {
            if(!uniques.add(s)){
                dups.add(s);
            }
        }
        uniques.removeAll(dups);

        System.out.println(uniques);
        System.out.println(dups);
    }
}
