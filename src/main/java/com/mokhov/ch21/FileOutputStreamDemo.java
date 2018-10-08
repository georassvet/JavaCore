package main.java.com.mokhov.ch21;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String string ="A little step of one man is a big step for the mankind";
        FileOutputStream fos1=null;
        FileOutputStream fos2=null;
        FileOutputStream fos3=null;
        byte[] b = string.getBytes();

        try {
             fos1 = new FileOutputStream("file1.txt");
             fos2 = new FileOutputStream("file2.txt");
             fos3 = new FileOutputStream("file3.txt");

            for (int i = 0; i <10 ; i++) {
                fos1.write(b[i]);
            }
            fos2.write(b);

            fos3.write(b,b.length-b.length/4,b.length/4);

        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(fos1!=null){
                try{
                    fos1.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fos2!=null){
                try{
                    fos2.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fos3!=null){
                try{
                    fos3.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
