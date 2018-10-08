package main.java.com.mokhov.ch13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        String str= "this is a string";
        pw.println(str);
        int i = -100;
        pw.println(i);
        double f = 1.5e-1;
        pw.println(f);

    }
}
