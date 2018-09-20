package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Ex12 {
    static Random random =new Random(47);
    public static List<Integer> fillList(int size){
        ArrayList<Integer> result= new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            result.add(random.nextInt(100));
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer>list1 = fillList(28);
        List<Integer>list2 = new ArrayList<>();

        System.out.println(list1);
        System.out.println(list2);

        ListIterator<Integer> listIterator = list1.listIterator();
        while (listIterator.hasNext()){
            list2.add(listIterator.next());
        }

        System.out.println(list1);
        System.out.println(list2);


    }
}
