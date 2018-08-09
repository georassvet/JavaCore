package ch2;

import javafx.scene.transform.Scale;

import java.util.Random;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        int num;
        num=100;

        System.out.print("The num is ");
        System.out.println(num);

        num*=100;

        System.out.print("The num is ");
        System.out.println(num);


    }
}
class E3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()>100){
            System.out.println("more than 100");
        }else{
            System.out.println("less than 100");
        }
    }
}
class E4LoopForTest{
    public static void main(String[] args){
        int random =(new Random()).nextInt(100000);
        for (int i = 0;; i++) {
            System.out.println(i);
            if(i==random){
                break;
            }
        }
        System.out.println("End of loop");
    }
}

class E5BlockCode{
    public static void main(String[] args){
        int x,y;
        y=20;
        for (x = 0; x<10 ; x++) {
            System.out.println("x: " + x + " y: " + y);
            y=y-2;
        }

    }
}
