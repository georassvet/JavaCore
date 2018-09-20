package main.thinkingInJava.exceptions;

import java.util.Scanner;

public class ResumptionBehavior {
    public static void main(String[] args) {
        start();
    }
    static void start(){
        boolean alive =true;
        while(alive) {
            try {
                Scanner scanner =new Scanner(System.in);
                System.out.println("Enter the number");
                int key = scanner.nextInt();
                if(key!=100){
                    throw new Exception("Please enter 100");
                }
                alive=false;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        System.out.println("last statement");
    }
}
