package main.java.com.mokhov.ch18collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRemove {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 10; i >=0 ; i--) {
            qu.add(i);
        }

        while (!qu.isEmpty()){
            System.out.println(qu.remove());
            Thread.sleep(1000);
        }

    }
}
