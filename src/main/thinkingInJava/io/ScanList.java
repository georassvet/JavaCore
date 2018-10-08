package main.thinkingInJava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());

            }
            System.out.format("%f, %<+016.10f",Math.PI);
        }finally {
            if(scanner!=null)
                scanner.close();
        }
    }
}
