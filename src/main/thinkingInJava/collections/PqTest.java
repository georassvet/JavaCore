package main.thinkingInJava.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class PqTest extends PriorityQueue<PqTest.MyObj> {
    static class MyObj implements Comparable<MyObj>{
        Integer value;
        static Random random =new Random(47);
        public MyObj(){
            value=random.nextInt(100);
        }

        @Override
        public int compareTo(MyObj o) {
            return value > o.value? +1 : (value==o.value ? 0 : -1);
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public static void main(String[] args) {
        PqTest pqTest =new PqTest();
        for (int i = 0; i < 10 ; i++) {
            pqTest.offer(new MyObj());
        }

        while (pqTest.peek()!=null){
            System.out.println(pqTest.remove());
        }

    }
}
