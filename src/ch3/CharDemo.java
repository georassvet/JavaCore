package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;
        Pattern pattern =Pattern.compile("[А-Яа-я]");
        Matcher m;
        for (int i = 0; i <5000 ; i++) {
            ch1=(char)i;
            System.out.println(ch1+" : "+i);
        }
//
//        ch1= 1090;
//        ch2 = 'Y';

      //  System.out.println("ch1: "+ch1+" ch2: "+ch2);
    }
}

