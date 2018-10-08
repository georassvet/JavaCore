package main.java.com.mokhov.ch21;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String string ="The following example is a character stream version of an example shown earlier\n" +
                "when FileOutputStream was discussed. This version creates a sample buffer of\n" +
                "characters by first making a String and then using the getChars( ) method to extract";

        try(FileWriter fileWriter =new FileWriter("writer1.txt");
            FileWriter fileWriter1 =new FileWriter("writer2.txt");
            FileWriter fileWriter2 =new FileWriter("writer3.txt")){
                fileWriter.write(string);
                fileWriter1.write(string,string.length()*3/4,string.length()/4);
                char[] buffer = string.toCharArray();

            for (int i = 0; i < buffer.length ; i++) {
                fileWriter2.write(buffer[i]);
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
