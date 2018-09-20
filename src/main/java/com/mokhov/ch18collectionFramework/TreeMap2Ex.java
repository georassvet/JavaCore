package main.java.com.mokhov.ch18collectionFramework;


import java.util.Comparator;
import java.util.TreeMap;

class MyComp2 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        int i = o1.lastIndexOf(" ");
        int j = o2.lastIndexOf(" ");

        int k = o1.substring(i).compareToIgnoreCase(o2.substring(j));
        if(k==0){
            return o1.compareToIgnoreCase(o2);
        }else{
            return k;
        }
    }
}


public class TreeMap2Ex {

    public static void main(String[] args) {
        TreeMap<String, Double> tm =new TreeMap<>(new MyComp2());
        tm.put("Vladimir Putin", 100.00);
        tm.put("Ivan Urgant", 150.00);
        tm.put("Ivan Ananiev", 90.00);
        tm.put("Arsen Degtyarov", 200.00);
        tm.put("Sergey Grigoriev", 1000.00);
        tm.put("Mihail Zeldin", 342.00);
        tm.put("Dmitriy Zeldin", 342.00);
        tm.put("Angela Merkel", 1000.00);

        System.out.println(tm);
    }
}
