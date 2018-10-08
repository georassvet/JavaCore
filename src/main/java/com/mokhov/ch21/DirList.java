package main.java.com.mokhov.ch21;

import java.io.File;
import java.io.InputStream;

public class DirList {
    public static void main(String[] args) {
        File startDir = new File("C:\\");
        System.out.format("%-20s %4s %10s%n","name", "type","size");
        move(startDir);
    }
    static void move(File file){
        if(file.isDirectory()){
            if(file.listFiles()!=null) {
                for (File f : file.listFiles()
                        ) {
                    move(f);
                }
            }
        }
        print(file);
    }
    static void print(File f){
        System.out.format("%-20s %4s %10d%n",f.getName(), f.isDirectory()?"dir":"file",f.length()/1024);
    }
}
