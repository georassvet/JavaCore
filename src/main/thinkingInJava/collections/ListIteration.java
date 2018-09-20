package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        ArrayList<Pet> pets =Pets.arrayList(12);
        ListIterator<Pet> listIterator = pets.listIterator();

        while (listIterator.hasNext()){
            System.out.println("nextIndex() "+listIterator.nextIndex()
                    +" previousIndex() "+listIterator.previousIndex()
                    +" next() "+listIterator.next());
        }
        System.out.println();
        while (listIterator.hasPrevious()){
            Pet pet =listIterator.previous();
            System.out.println(pet.getId()+":"+pet.getName());
        }
        System.out.println();
        System.out.println(pets);
        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.set(Pets.getPetRandom());
        }
        System.out.println(pets);
    }
}
