package main.java.com.mokhov.ch6;




public class BoxDemo {
    public static void main(String[] args) {
        Box1 box =new Box1();
        box.width=15;
        box.height=10;
        box.depth=7;

        double volume = box.depth*box.width*box.height;
        System.out.println("Volume " + volume);
    }
}
