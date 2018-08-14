package main.java.com.mokhov.ch7;

public class Outer2 {
    int i =100;

    void addStoApples(){
        for (int j = 0; j < 100 ; j++) {
            class Apple{
                private int id;
                Apple(int id){
                    this.id=id;
                }
                void display(){
                    System.out.println("Apple "+id+i);
                }
            }
            Apple apple =new Apple(j);
            apple.display();

        }
    }


}
class TestOuter2{
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.addStoApples();
    }
}
