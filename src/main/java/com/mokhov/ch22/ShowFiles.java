package main.java.com.mokhov.ch22;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowFiles {
    public static void main(String[] args) {
        int c;
        try(BufferedInputStream inputStream =new BufferedInputStream(Files.newInputStream(Paths.get("input.txt")));
            OutputStream outputStream =Files.newOutputStream(Paths.get("output.txt"))){

            while ((c = inputStream.read())!=-1){
                System.out.print((char)c);
                outputStream.write(c);

            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
