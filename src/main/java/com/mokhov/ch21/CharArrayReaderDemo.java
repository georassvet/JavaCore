package main.java.com.mokhov.ch21;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String string ="abcdefghijklmnopqrstuvwxyz";
        char[] buf=new char[string.length()];
        string.getChars(0,string.length(),buf,0);
        int i;
        try(CharArrayReader car1 = new CharArrayReader(buf)) {
            while ((i=car1.read())!=-1){
                System.out.print((char)i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println();
        try(CharArrayReader car2 = new CharArrayReader(buf, buf.length/4, buf.length*3/4)){
            while ((i=car2.read())!=-1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
