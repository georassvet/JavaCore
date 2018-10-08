package main.thinkingInJava.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        String in = "input.txt";
        String out = "output.txt";

        try{
            fileReader = new FileReader(out);
            fileWriter = new FileWriter(in);

            while (fileReader.read()!=-1){
                int c =fileReader.read();
                fileWriter.write(c);
            }
        }finally {
            if(fileReader!=null){
                fileReader.close();
            }
            if(fileWriter!=null){
                fileWriter.close();
            }
        }
    }
}
