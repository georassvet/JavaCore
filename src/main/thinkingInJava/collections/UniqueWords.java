package main.thinkingInJava.collections;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UniqueWord{
    String word;
    int count;
    public UniqueWord(String word){
        this.word=word;
        count=1;
    }
}

public class UniqueWords {
    public static void main(String[] args) {
        String text ="Hello world and every part of sheep and zebra of world I and i also you want a cup of tea";

        Set<UniqueWord> words =new HashSet<>();


        for (String s : text.split(" ")
             ) {


        }



        parse(text,"[AEYUIOaeyuio]");
        parse(text,"");

    }



    public static void parse(String text,String pat){

        Map<String,Integer> unique = new HashMap<>();
        Pattern pattern =Pattern.compile(pat);
        Matcher matcher =pattern.matcher(text);
        while (matcher.find()){

            String ch = matcher.group();
            Integer freq = unique.get(ch);
            unique.put(ch, freq==null?1:freq+1);
        }
        System.out.println(unique);
        }

    }
