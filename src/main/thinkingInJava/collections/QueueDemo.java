package main.thinkingInJava.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

    public static <T> void printQ(Queue<T> queue){
        while (queue.peek()!=null){
            System.out.print(queue.remove()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <20 ; i++) {
            queue1.offer(random.nextInt(100));
        }
        printQ(queue1);
        Queue<Character> characters =new LinkedList<>();
        for (Character ch: "Brontosaur".toCharArray()
             ) {
            characters.offer(ch);
        }

        printQ(characters);

    }
}
