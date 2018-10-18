package main.java.com.mokhov.ch28;

import java.util.Random;

class Book{
    String name;
    boolean empty = true;

   synchronized String read(){
        while (empty){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Read book "+ name);
        empty=true;
        notifyAll();
        return name;
    }
   synchronized void buy(String book){
        while (!empty)
        {
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        this.name = book;
        empty=false;
        notifyAll();
        System.out.println("Bought new book " + name);
    }
}

class  BookProducer implements Runnable{
    Book book;

    public BookProducer(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        String[] books ={
                "Война и мир",
                "Тихий Дон",
                "Преступление и наказание"
        };
        for (int i = 0; i < books.length ; i++) {
            book.buy(books[i]);
        }
        book.buy("None");
    }
}

class BookConsumer implements Runnable{
    Book bookStore;

    public BookConsumer(Book bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void run() {
        for (String book = bookStore.read() ; !book.equals("None") ; book= bookStore.read()) {
            System.out.println(book);
            try {
                Thread.sleep((new Random()).nextInt(5000));
            }catch (InterruptedException e){}
        }

    }
}


public class ProducerConsumerDemo3 {
    public static void main(String[] args) {
        Book book = new Book();
        new Thread(new BookProducer(book)).start();
        new Thread(new BookConsumer(book)).start();

    }
}
