package main.java.com.mokhov.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        char ch;
        do{
            int r = bufferedReader.read();
             ch = (char)r;
            System.out.println(ch);
        }while (ch!='q');

    }
}
