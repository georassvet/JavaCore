package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WorkPlace{
    private String address;
    private double cost;

    WorkPlace(String address, double cost){
        this.address=address;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return address+" : "+cost;
    }
}
class Work{
    private WorkPlace[] workPlaces = new WorkPlace[]{
      new WorkPlace("Краснодонская,3 стр.2", 5000.00),
      new WorkPlace("Кубанская, 13 стр.1", 5000.00),
      new WorkPlace("Кубанская, 23", 2500.00),
      new WorkPlace("Краснодонская,23 стр.2", 5000.00)
    };

    ArrayList<WorkPlace> arrayList(int size){
        Random random =new Random();
        ArrayList<WorkPlace> result =new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            result.add(workPlaces[random.nextInt(workPlaces.length)]);
        }
        return result;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Work work =new Work();
        List<WorkPlace> workPlaces = work.arrayList(10);
        System.out.println("1: "+workPlaces);
        List<WorkPlace> subList = workPlaces.subList(1,3);
        System.out.println("2: "+subList);
        workPlaces.removeAll(subList);
        System.out.println("3: "+workPlaces);

    }
}
