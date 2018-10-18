package main.thinkingInJava.concurrency;

import java.util.concurrent.Executor;

class Data{
    String myString = "Быстрее. Выше. Сильнее";
    int myAge =28;
}

public class Start1 implements Runnable {
    private Data data;

    public Start1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

    }
}
class Start1Demo{
    public static void main(String[] args) {


    }
}
