package main.thinkingInJava.collections;

import java.util.Iterator;

public class PetSequence {
    Pet[] pets;
    PetSequence(int size){
        pets =new Pet[size];
        for (int i = 0; i < size ; i++) {
            pets[i]=Pets.getPetRandom();
        }
    }
}

class NonCollectionSequence extends PetSequence{
    NonCollectionSequence(int size){
        super(size);
    }
    Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            int index=0;
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

    public static void main(String[] args) {
        NonCollectionSequence nonCollectionSequence =new NonCollectionSequence(10);
        CollectionVsIterator.display(nonCollectionSequence.iterator());

    }

}
