package ch3;

public class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r=10.8;
        pi=3.1416;
        a = pi*Math.pow(r,2);
        System.out.println("area of circle " +a);
        a = pi*r*r;
        System.out.println("area of circle " +a);
    }

}
