package main.thinkingInJava.io;

import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) {
//        PPrinter.pprint(Directory.walk(".").dirs);
//
//        for (File f : Directory.local(".","T.*")){
//            System.out.println(f);
//        }
//
//        for (File f : Directory.local(".","T.*\\.java")){
//            System.out.println(f);
//        }
//
//        for (File f : Directory.local(".","[Zz].*\\.class")){
//            System.out.println(f);
//        }
        System.out.println(Directory.getTotalSize("./src/main/java/com/mokhov/ch10","\\w*.java"));

    }
}
