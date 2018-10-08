package main.java.com.mokhov.ch22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("input.txt");
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
        if(Files.isDirectory(path)){
            System.out.println("path is a directory");
        }else{
            System.out.println("path is not a directory");
        }
        if(Files.isExecutable(path)){
            System.out.println("path is executable");
        }else{
            System.out.println("path is not executable");
        }

        try {
            BasicFileAttributes attributes = Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(attributes.isDirectory());
            System.out.println(attributes.isRegularFile());
            System.out.println(attributes.isSymbolicLink());
            System.out.println(attributes.size());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
