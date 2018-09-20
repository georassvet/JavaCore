package main.java.com.mokhov.ch18collectionFramework;

import java.util.Comparator;
import java.util.TreeMap;

class FirstComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
       char ch1 =  o1.charAt(0);
       char ch2 =  o2.charAt(0);
        if(ch1==ch2){
            return 0;
        }else if(ch1>ch2){
            return 1;
        }else{
            return -1;
        }
    }
}
class SecondComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        char ch1 =  o1.charAt(o1.length()-1);
        char ch2 =  o2.charAt(o2.length()-1);
        if(ch1==ch2){
            return 0;
        }else if(ch1>ch2){
            return 1;
        }else{
            return -1;
        }
    }
}

public class TreeMap2AEx {
    public static void main(String[] args) {
        TreeMap<String,Double> rusCitiesSquare =new TreeMap<>();

        rusCitiesSquare.put("Moscow", 100.00);
        rusCitiesSquare.put("Izevsk", 100.00);
        rusCitiesSquare.put("Irkutsk", 100.00);
        rusCitiesSquare.put("Moscorw", 100.00);
        rusCitiesSquare.put("Sankt", 100.00);
        rusCitiesSquare.put("Novgorod", 100.00);
        rusCitiesSquare.put("Kazan", 100.00);
        rusCitiesSquare.put("Omsk", 100.00);

        System.out.println(rusCitiesSquare);

        TreeMap<String,Double> rusCitiesSquare2 =new TreeMap<>(new FirstComp().thenComparing(new SecondComp()));
        rusCitiesSquare2.putAll(rusCitiesSquare);
        System.out.println(rusCitiesSquare2);

    }


}
