package main.java.com.mokhov.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String[] strings =new String[100];
        for (int i = 0; i <100 ; i++) {
            strings[i] = bufferedReader.readLine();
            System.out.println(strings[i]);
            if(strings[i].equals("stop"));
            break;
        }
        System.out.println("===============================");
        for (String s: strings
             ) {
            System.out.println(s);
        }
    }
}
