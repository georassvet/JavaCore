package main.java.com.mokhov.ch21;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String string = "<a href=\"/article/28\" class=\"footer-link\">&copy; 2018 company group &;HeadHunter &copytryigft </a>";
        boolean marked = false;
        int s;
        try(BufferedReader br = new BufferedReader(new CharArrayReader(string.toCharArray()))) {
            while ((s = br.read()) != -1) {
                switch (s){
                    case '&':{
                        if(!marked) {
                            marked = true;
                            br.mark(32);
                        }else{
                            marked=false;
                        }
                        break;
                    }
                    case ';':{
                        if(marked) {
                            System.out.print("(c)");
                            marked = false;
                        }else{
                            System.out.println((char)s);
                        }
                        break;
                    }
                    case ' ':{
                        if(marked){
                            System.out.print("&");
                            marked=false;
                            br.reset();
                        }
                        else {
                            System.out.print((char)s);
                        }
                        break;
                    }
                    default:{
                        if(!marked){
                            System.out.print((char)s);
                        }
                        break;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
