package main.java.com.mokhov.ch18collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,Double> moneyBack = new HashMap<>();
        moneyBack.put("Vladimir Mokhov", 700.00);
        moneyBack.put("Alexey Mokhov", 3300.00);
        moneyBack.put("Alexey Loy", 500.00);

        Set<Map.Entry<String,Double>> entrySet = moneyBack.entrySet();

        for (Map.Entry<String,Double> val:entrySet
             ) {
            System.out.println(".getKey() " + val.getKey() + " .getVal() " + val.getValue());
        }
        try {
            //double sm = moneyBack.get("Sergey Mokhov");
            double al = moneyBack.get("Alexey Loy");
            System.out.println(al);
            moneyBack.put("Alexey Loy",al+100);
            System.out.println(moneyBack.get("Alexey Loy"));
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }


        System.out.println();

    }


}
