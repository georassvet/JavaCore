package main.thinkingInJava.collections;

import java.util.Arrays;
import java.util.PriorityQueue;

class Test{
}
public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<Test> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Test());
        priorityQueue.offer(new Test());
        priorityQueue.offer(new Test());
        priorityQueue.offer(new Test());
        QueueDemo.printQ(priorityQueue);
    }
}
