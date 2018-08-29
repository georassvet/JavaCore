package main.java.com.mokhov.ch18collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx {
    public static void main(String[] args) {
//        HashSet<String> brands = new HashSet<>();
        LinkedHashSet<String> brands =new LinkedHashSet<>();

        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Ecco");
        brands.add("Reebok");
        brands.add("Siemens");
        brands.add("Bosh");

        System.out.println(brands);

        brands.add("Kia");

        System.out.println(brands);

        brands.remove("Bosh");
        System.out.println(brands);


    }
}
