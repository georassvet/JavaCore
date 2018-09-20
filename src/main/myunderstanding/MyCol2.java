package main.myunderstanding;

import java.util.*;

class Dictionary{
    private Map<String,String> dictionary = new TreeMap<>();
    private Map<String, Integer> wordRate = new HashMap<>();

    public void addWord(String ruWord, String enWord){
        dictionary.put(ruWord,enWord);
    }
    public void teachWords(){
        Set<String> keys = dictionary.keySet();
        for (String s: keys
             ) {
            System.out.println(s);
        }
    }

}
public class MyCol2 {
    public static void main(String[] args) {
        Dictionary dictionary =new Dictionary();
        dictionary.addWord("жалоба","complaint");
        dictionary.addWord("намерение","intent");

        dictionary.teachWords();

    }
}











