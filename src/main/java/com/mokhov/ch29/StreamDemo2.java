package main.java.com.mokhov.ch29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(10);
        list.add(5);
        list.add(1);

        Optional<Integer> optInt = list.stream().reduce((a, b)->(a*b));
        if(optInt.isPresent())
            System.out.println(optInt.get());
        Integer intVal = list.stream().reduce(1,(a,b)->a*b);
        System.out.println(intVal);

        Integer evenVal = list.stream().reduce(1,(a,b)->{
            if(b % 2 == 0)
                return a*b;
            else
                return a;
         });
        System.out.println(evenVal);



    }
}
