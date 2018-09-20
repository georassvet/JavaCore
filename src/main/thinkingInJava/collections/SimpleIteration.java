package main.thinkingInJava.collections;

import java.util.*;

abstract class Pet{

    static int counter;

    private int id;
    private String name;

    public Pet(String name){
        this.name=name;
        id=counter++;
    }

    @Override
    public String toString() {
        return id+":" +name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
class Dog extends Pet{
    public Dog(String name){
        super(name);
    }
}
class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
}
class Hamster extends Pet{
    public Hamster(String name){
        super(name);
    }
}
class Turtle extends Pet{
    public Turtle(String name){
        super(name);
    }
}
class Parrot extends Pet{
    public Parrot(String name){
        super(name);
    }
}

class Pets{
    static Random random =new Random();
    static Pet[] pets = new Pet[]{
            new Hamster("Соня"),
            new Dog("Боня"),
            new Cat("Муся"),
            new Turtle("Даша"),
            new Parrot("Кеша")
    };

    public static ArrayList<Pet> arrayList(int size){

        ArrayList<Pet> resultArray =new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            resultArray.add(pets[(random.nextInt(pets.length))]);
        }
        return resultArray;
    }
    public  static Pet getPetRandom(){
        return pets[random.nextInt(pets.length)];
    }
}
public class SimpleIteration {
    static void display(Iterator<Pet> iterator){
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.print(pet + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Pet> myPets = Pets.arrayList(10);
        LinkedList<Pet> linkedList =new LinkedList<>(myPets);
        HashSet<Pet> hashSet =new HashSet<>(myPets);
     //   TreeSet<Pet> treeSet =new TreeSet<>(myPets);
        LinkedHashSet<Pet> linkedHashSet =new LinkedHashSet<>(myPets);

        display(linkedList.iterator());
        display(linkedHashSet.iterator());
     //   display(treeSet.iterator());
       display(hashSet.iterator());
        display(myPets.iterator());

    }
}
