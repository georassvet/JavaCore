package main.myunderstanding;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;


public class FilesClass {
    public static void main(String[] args) {
       File path = new File("E:\\TestDelete");
       delete(path);
    }
    static void delete(File file) {
        File[] files;
        try {
            BasicFileAttributes attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            System.out.println("getName() " + file.getName());
            System.out.println("size()" + attributes.size());
            System.out.println("isSymbolicLink() " + attributes.isSymbolicLink());
            System.out.println("isRegularFile() " + attributes.isRegularFile());
            System.out.println("lastModifiedTime()" + attributes.lastModifiedTime());

        }catch (IOException e){
            System.out.println("");
        }
        if (file.isDirectory()) {
            if ((files = file.listFiles()).length != 0) {
                for (int i = 0; i < files.length; i++) {
                    delete(files[i]);
                }
            }
        }
        try {
            System.out.println("Удаление");
            Files.delete(file.toPath());
            System.out.println("Удалено");
        } catch (IOException e) {
            System.out.println("Не возможно удалить: " + e);
        }

    }
}
