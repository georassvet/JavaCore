package main.java.com.mokhov.ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream =new FileInputStream("input.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt")){

            do{
                int k = fileInputStream.read();
                if(k!=1)fileOutputStream.write(k);
            }while(fileInputStream.read()!=-1);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
