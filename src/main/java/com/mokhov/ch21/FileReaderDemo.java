package main.java.com.mokhov.ch21;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        int c;
        try(FileReader fileReader =new FileReader("input.txt")){
            while ((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
