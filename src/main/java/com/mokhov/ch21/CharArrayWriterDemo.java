package main.java.com.mokhov.ch21;


import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        char[] chars = new char[str.length()];
        CharArrayWriter writer = new CharArrayWriter();
        str.getChars(0,str.length(),chars,0);
        try{

            writer.write(chars);
        }catch (IOException e){
            e.printStackTrace();
        }
        char[] chars1 =writer.toCharArray();
        for (char ch:chars1
             ) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println(writer.toString());

        try(FileWriter fileWriter =new FileWriter("chars.txt")){
            writer.writeTo(fileWriter);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
