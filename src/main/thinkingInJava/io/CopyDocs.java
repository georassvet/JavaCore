package main.thinkingInJava.io;

import java.io.*;

public class CopyDocs {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream("input.txt");
            fos = new FileOutputStream("output.txt");
            while (fis.read() != -1) {
                int b = fis.read();
                fos.write(b);
            }
        } finally {
            if(fis!=null){
                fis.close();
            }
            if(fos!=null){
                fos.close();
            }
        }
    }
}
