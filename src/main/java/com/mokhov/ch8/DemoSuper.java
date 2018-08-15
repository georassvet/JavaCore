package main.java.com.mokhov.ch8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 =new BoxWeight(10,12,13,14);
        BoxWeight mybox2 =new BoxWeight();
        BoxWeight mybox3 =new BoxWeight(mybox2);
        BoxWeight mybox4 =new BoxWeight(15,20);

        System.out.println("mybox1.getVolume() "+mybox1.getVolume());
        System.out.println("mybox2.getVolume() "+mybox2.getVolume());
        System.out.println("mybox3.getVolume() "+mybox3.getVolume());
        System.out.println("mybox4.getVolume() "+mybox4.getVolume());



    }
}
