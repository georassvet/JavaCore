package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> protocols1 = new ArrayList<>();
        protocols1.add("TCP");
        protocols1.add("UDP");
        protocols1.add("HTTP");
        protocols1.add("HTTPS");

        List<String> protocols2 = new ArrayList<>(protocols1);
        List<String> protocols3= new ArrayList<>(10);



        System.out.println(protocols1);
        protocols1.remove("HTTP");
        System.out.println(protocols1);
        System.out.println(protocols2);
        while(!protocols3.isEmpty())
            protocols3.remove(1);
        System.out.println(protocols3);
    }
}
