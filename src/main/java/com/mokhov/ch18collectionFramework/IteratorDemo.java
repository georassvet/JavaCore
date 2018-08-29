package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> birds = new ArrayList<>();
        birds.add("Eagle");
        birds.add("Crow");
        birds.add("Parrot");
        birds.add("Eagle");
        birds.add("Eagle");
        birds.add("Magpie");
        birds.add("Owl");

        Iterator<String> stringIterator = birds.iterator();
        while (stringIterator.hasNext()){
            System.out.print(stringIterator.next()+" ");
        }
        System.out.println();

        ListIterator<String> listIterator =birds.listIterator();
        while (listIterator.hasNext()){
            String bird = listIterator.next();
            listIterator.set(bird+"$");
        }

  //      listIterator=birds.listIterator();
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
