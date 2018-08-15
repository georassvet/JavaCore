package main.java.com.mokhov.ch8;

public class RefDemo {
    public static void main(String[] args) {
        ColorBox colorBox = new ColorBox("red", 10,12,15);
        BoxWeight boxWeight = new BoxWeight(100,23,24,12);

        Box b1  = colorBox;
        System.out.println(b1.getVolume());

        Box b2 =boxWeight;
        b2.getVolume();

    }
}
