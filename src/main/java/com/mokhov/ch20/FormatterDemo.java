package main.java.com.mokhov.ch20;

import java.util.Date;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter formatter =new Formatter();
        String name ="Sergey Mokhov";
        Date date = new Date();
        int height = 170;
        formatter.format("%s %tc %d", name,date,height);
        System.out.println(formatter);

        formatter.format("|%-10.2f|",123.123);
        System.out.println(formatter);

        formatter.close();
    }
}
