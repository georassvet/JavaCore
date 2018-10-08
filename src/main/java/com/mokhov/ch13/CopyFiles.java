package main.java.com.mokhov.ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream =new FileInputStream("input.txt");
            fileOutputStream= new FileOutputStream("output.txt");
            int i;
            do{
                 i = fileInputStream.read();
                 if(i!=-1){
                     fileOutputStream.write(i);
                     System.out.print((char)i);
                 }
            }while(i!=-1);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                if(fileInputStream!=null)fileInputStream.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
            try{
                if(fileOutputStream!=null)fileOutputStream.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
