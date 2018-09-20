package main.thinkingInJava.collections;

import java.util.LinkedList;


public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Pet> pets =new LinkedList<>(Pets.arrayList(10));
        System.out.println("1. " + pets);
        System.out.println("2. pets.getFirst() " + pets.getFirst());
        System.out.println("3. pets.element() "+pets.element());
        LinkedList<Pet> petsEmpty =new LinkedList<>();
        System.out.println("4. petsEmpty.peek() "+petsEmpty.peek());

        System.out.println("5. pets.remove() " + pets.remove());
        System.out.println("after remove " + pets);
        System.out.println("6. pets.removeFirst() " + pets.removeFirst());
        System.out.println("after remove " + pets);
        System.out.println("7. petsEmpty.poll() "+ petsEmpty.poll());
        System.out.println("8. petsEmpty.add() "+petsEmpty.add(Pets.getPetRandom()));
        System.out.println("9. petsEmpty.add() "+petsEmpty.add(Pets.getPetRandom()));
        System.out.println(petsEmpty);
        petsEmpty.addFirst(Pets.getPetRandom());
        petsEmpty.addLast(Pets.getPetRandom());
        petsEmpty.addFirst(Pets.getPetRandom());
        System.out.println("10. petsEmpty.offer()"+petsEmpty.offer(Pets.getPetRandom()));
        System.out.println(petsEmpty);
        System.out.println(petsEmpty.removeLast());
        System.out.println(petsEmpty.removeFirst());
        System.out.println(petsEmpty);
        System.out.println();

    }
}
