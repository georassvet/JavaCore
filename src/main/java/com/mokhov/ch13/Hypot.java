package main.java.com.mokhov.ch13;
import static java.lang.Math.*;
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypo;
        side1=3.0;
        side2=4.0;

       // hypo = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        hypo=sqrt(pow(side1,2)+pow(side2,2));

        System.out.println(hypo);
    }
}
