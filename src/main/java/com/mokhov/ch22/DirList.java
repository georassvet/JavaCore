package main.java.com.mokhov.ch22;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {

    static void recursiveDir(Path path){
        try(DirectoryStream<Path> dir = Files.newDirectoryStream(path)){
            for (Path p : dir
                 ) {
                BasicFileAttributes attributes = Files.readAttributes(p,BasicFileAttributes.class);
                if(attributes.isDirectory()){
                    recursiveDir(p);
                }
                else{
                    System.out.println(p);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Path start = Paths.get("C:\\");
        recursiveDir(start);
    }
}
