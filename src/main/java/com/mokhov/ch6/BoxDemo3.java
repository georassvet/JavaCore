package main.java.com.mokhov.ch6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        Box1 box2 = new Box1();

        box2.height = 2;
        box2.width = 3;
        box2.depth = 4;

        System.out.println("Volume box 1 "+box1.getVolume());
        System.out.println("Volume box 2 "+box2.getVolume());
    }
}
