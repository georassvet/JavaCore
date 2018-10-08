package main.java.com.mokhov.ch21;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        String s ="if(a==4) a=0;\n";
        int c;
        char[] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        try(PushbackReader pushbackReader =new PushbackReader(new CharArrayReader(buf))){
            while ((c=pushbackReader.read())!=-1){
                switch ((char)c){
                    case '=':{
                        c=pushbackReader.read();
                        if((char)c == '='){
                            pushbackReader.unread(c);
                            System.out.print(".eq.");
                        }
                        else{
                            System.out.print("<-");
                        }
                        break;
                    }
                    default:{
                        System.out.print((char)c);
                        break;
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
