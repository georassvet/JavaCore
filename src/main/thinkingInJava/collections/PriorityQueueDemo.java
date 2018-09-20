package main.thinkingInJava.collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        Random random =new Random(47);
        for (int i = 0; i <10 ; i++) {
            integers.offer(random.nextInt(i+10));
        }
        QueueDemo.printQ(integers);


        PriorityQueue<String> strings =new PriorityQueue<>(Collections.reverseOrder());
        String str = "Я продаю клубнику, выращенную собственными руками, а за взятки родную дочь";
        //Я а взятки выращенную дочь за клубнику, продаю родную руками, собственными
        for (String s:str.split(" ")
             ) {
            strings.offer(s);
        }
        QueueDemo.printQ(strings);

        PriorityQueue<Character> characters =new PriorityQueue<>();

        for (Character ch : str.toCharArray()
             ) {
            characters.offer(ch);
        }
        QueueDemo.printQ(characters);
    }
}
