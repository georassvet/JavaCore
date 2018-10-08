package main.java.com.mokhov.ch21;

import java.io.File;

public class FileDemo {

    static void show(String date){
        System.out.println(date);
    }

    public static void main(String[] args) {
        File file = new File(".");

        show("file.getName() " + file.getName());
        show("file.getAbsolutePath() " + file.getAbsolutePath());
        show("file.lastModified() " + file.lastModified());
        show("file.getParent() " + file.getParent());
        show("file.isFile() " + file.isFile());
        show("file.isDirectory() " + file.isDirectory());
        show("file.length() " + file.length());
        show("file.getName() " + file.getName());
        show("file.getPath() " + file.getPath());
        show("file.canWrite() " + file.canWrite());
        show("file.canRead() " + file.canRead());
        show("file.getUsableSpace() " + file.getUsableSpace());
        show("file.getFreeSpace() " + file.getFreeSpace());
        show("file.isAbsolute() " + file.isAbsolute());
        System.out.println("file.list()");
        for (String s: file.list()
             ) {
            System.out.println(s);
        }
        System.out.println("file.listFiles()");
        for (File s: file.listFiles()
                ) {
            System.out.println(s.getName());
        }





    }
}
