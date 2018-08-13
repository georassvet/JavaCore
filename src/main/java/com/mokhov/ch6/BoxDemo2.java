package main.java.com.mokhov.ch6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box1 box1 =new Box1();
        Box1 box2 =new Box1();

        box1.height=10;
        box1.width=20;
        box1.depth=15;

        box2.width=10;
        box2.height=12;
        box2.depth =15;

        System.out.println("volum box1 "+ box1.depth*box1.height*box1.width);
        System.out.println("volum box2 "+ box2.depth*box2.height*box2.width);


    }
}
