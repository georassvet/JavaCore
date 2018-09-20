package main.thinkingInJava.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex14 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList =new LinkedList<>();
        ListIterator<Integer> li=linkedList.listIterator();
        for (int i = 0; i < 20 ; i++) {
            linkedList.add(linkedList.size()/2,i);
            System.out.println(linkedList);
        }






    }
}
