package main.java.com.mokhov.ch28;

import java.util.concurrent.Semaphore;

class Scientist extends Thread{
    Semaphore semaphore;
    int num;

    int ate = 0;

    Scientist(int num, Semaphore semaphore){

        this.semaphore = semaphore;
        this.num = num;
    }

    @Override
    public void run() {
        try {
            while(ate <= 3) {
                semaphore.acquire();
                System.out.println(num + " cел за стол");
                Thread.sleep(500);

                ate++;

                System.out.println(num + " пошел гулять после " + ate + " приема пищи");
                semaphore.release();
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class SemDemo2 {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Scientist(i,sem).start();
    }
}

// класс философа
class Philosopher extends Thread
{
    Semaphore sem; // семафор. ограничивающий число философов
    // кол-во приемов пищи
    int num = 0;
    // условный номер философа
    int id;
    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }

    public void run()
    {
        try
        {
            while(num<3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println ("Философ " + id+" садится за стол");
                // философ ест
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();

                // философ гуляет
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}