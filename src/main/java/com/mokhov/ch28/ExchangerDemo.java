package main.java.com.mokhov.ch28;

import java.util.concurrent.Exchanger;

class MakeString implements Runnable{
    Exchanger<String> exchanger;
    String str;
    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <5 ; j++) {
                str+=ch++;
            }
        }
        try {
         str=exchanger.exchange(str);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class UseString implements Runnable{
    Exchanger<String> exchanger;
    String str;
    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3 ; i++) {
            try {
                str = exchanger.exchange(new String());
                System.out.println("Got "+ str);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String>  exchanger = new Exchanger<>();
        new Thread(new MakeString(exchanger)).start();
        new Thread(new UseString(exchanger)).start();
    }
}
