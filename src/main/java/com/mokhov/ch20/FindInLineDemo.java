package main.java.com.mokhov.ch20;

import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner("Name: Fedor Age: 28 Height: 170");

        scanner.findInLine("Age:");
        if(scanner.hasNext()){
            System.out.println(scanner.next());
        }else{
            System.out.println("Error");
        }


        scanner.findInLine("Name:");
        if(scanner.hasNext()){
            System.out.println(scanner.next());
        }else{
            System.out.println("Error");
        }

        scanner.close();

    }
}
