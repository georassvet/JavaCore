package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;

public class ForEachEx {
    public static void main(String[] args) {
        ArrayList<Integer> porch = new ArrayList<>();
        porch.add(2);
        porch.add(4);
        porch.add(4);
        porch.add(4);

        int sum = 0;
        int moneyPerPorch = 2500;


        for (int i:porch
             ) {
            sum+=i;
        }
        System.out.println("Сделанно подъездов: "+ sum);
        System.out.println("Зарплата: " + sum*moneyPerPorch/2 );
    }
}
