package main.java.com.mokhov.ch18collectionFramework;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<String> stringList =Arrays.asList("Корова","Собака","Кошка", "Курица","Бегемот","Крокодил");
        for (int i = 0; i < 10 ; i++) {

            Collections.shuffle(stringList);
//            shuffle(stringList,new Random(47));
            System.out.println(stringList);
        }
        for (ListIterator<String> li = stringList.listIterator(stringList.size());li.hasPrevious();) {
            System.out.println(li.previous());
        }
    }

    public static <E> void swap(List<E> list, int i, int j){
        E tmp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, tmp);
    }
//    public static void shuffle(List<?> list, Random random){
//        for (int i = list.size(); i > 1; i--) {
//            swap(list, i-1, random.nextInt(i));
//        }
//    }


}
