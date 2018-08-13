package main.java.com.mokhov.ch6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box1 box = new Box1();
        box.setDimensions(10,12,23);
        System.out.println(box.getVolume());
    }
}
