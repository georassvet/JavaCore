package main.thinkingInJava.collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {
    public static void main(String[] args) {
        Random random =new Random(47);
        PriorityQueue<Double> doubles = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 10 ; i++) {
            doubles.offer(random.nextDouble());
        }
        QueueDemo.printQ(doubles);

        while (doubles.peek()!=null){
            System.out.print(doubles.poll());
        }




    }
}
