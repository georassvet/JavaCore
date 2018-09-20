package main.thinkingInJava.collections;

import java.util.*;

public class CollectionVsIterator{


    public static <E> void display(Collection<E> collection){
        for (E e:collection
             ) {
            System.out.print(e);
        }
        System.out.println();
    }
    public static <E> void display(Iterator<E> iterator){
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(15);
        Set<Pet> petSet = new HashSet<>(pets);
        Map<String,Pet> map =new LinkedHashMap<>();
        String[] names ={"Sergey Mokhov", "Ivan Susanin", "Vladimir Putin", "Aleksander Ovechkin"};
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], Pets.getPetRandom());
        }
        display(pets);
        display(petSet);
        display(pets.iterator());
        display(petSet.iterator());

        System.out.println(map);
        System.out.println(map.keySet());

        display(map.values());
        display(map.values().iterator());








    }
}
