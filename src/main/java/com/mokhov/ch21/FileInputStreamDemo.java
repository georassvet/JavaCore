package main.java.com.mokhov.ch21;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {

        try(FileInputStream fileInputStream =new FileInputStream("input.txt")){
            int size;
            System.out.println("Total available bytes " + (size=fileInputStream.available()));
            int n =size/5;
            for (int i = 0; i <n ; i++) {
                System.out.print((char)fileInputStream.read());
            }
            System.out.println();
            System.out.println("fileInputStream.available() " + fileInputStream.available());
            fileInputStream.skip(n);
            System.out.println("fileInputStream.available() " + fileInputStream.available());

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
