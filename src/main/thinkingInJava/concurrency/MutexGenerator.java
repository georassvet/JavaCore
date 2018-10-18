package main.thinkingInJava.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexGenerator extends IntGenerator {
    int currentValue = 0;
    Lock lock =new ReentrantLock();
    @Override
    public int next() {
        try {
            lock.lock();
            ++currentValue;
            Thread.yield();
            ++currentValue;
            return currentValue;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexGenerator());
    }
}
