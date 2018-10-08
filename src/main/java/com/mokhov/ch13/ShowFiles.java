package main.java.com.mokhov.ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFiles {
    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos =null;

        try{
            fis = new FileInputStream("input.txt");
            fos = new FileOutputStream("output.txt");
        }catch (FileNotFoundException ex){
          ex.printStackTrace();
        }

        try{
            int k;
            do{
                k = fis.read();
                if(k!=-1) System.out.print((char)k);
                fos.write(k);
            }while (k!=-1);
            fos.write(1111111111);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        try{
            fis.close();
            fos.close();
        }catch (IOException ex){

        }
    }
}
