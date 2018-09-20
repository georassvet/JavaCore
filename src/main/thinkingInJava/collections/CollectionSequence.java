package main.thinkingInJava.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence implements Collection<Pet> {

    private Pet[] pets;
    public CollectionSequence(){
        pets = new Pet[10];
        for (int i = 0; i <pets.length ; i++) {
            pets[i]=Pets.getPetRandom();
        }
    }

    public static void main(String[] args) {
        CollectionSequence collectionSequence =new CollectionSequence();
        Iterator<Pet> iterator =collectionSequence.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (Pet p : collectionSequence
             ) {
            System.out.print(p+" ");
        }
    }

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                if(index<pets.length)
                    return true;
                return false;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Pet pet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
