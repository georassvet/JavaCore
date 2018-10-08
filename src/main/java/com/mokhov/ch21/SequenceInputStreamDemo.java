package main.java.com.mokhov.ch21;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class EnumerationInputStream implements Enumeration<FileInputStream>{

    private Enumeration<String> files;

    public  EnumerationInputStream(Vector<String> files){
        this.files =files.elements();
    }
    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement());
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}

public class SequenceInputStreamDemo {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("file1.txt");
        vector.add("file2.txt");
        vector.add("file3.txt");
        EnumerationInputStream enumerationInputStream =new EnumerationInputStream(vector);
        SequenceInputStream sequenceInputStream =new SequenceInputStream(enumerationInputStream);
        int c;
        try {
            while ((c = sequenceInputStream.read()) != -1) {
                System.out.print((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                sequenceInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
