package main.java.com.mokhov.ch7;

public class OverloadCons {
    public static void main(String[] args) {
        Box b1 =new Box();
        System.out.println(b1.getVolume());

        Box b2 =new Box(23.23);
        System.out.println(b2.getVolume());

        Box b3 =new Box(20,12,23);
        System.out.println(b3.getVolume());

        Box cloneBox = new Box(b2);
        cloneBox.width=100;
        System.out.println( cloneBox.getVolume());
        System.out.println(b2.getVolume());
    }
}
